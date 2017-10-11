package utiity;

import java.util.List;

import org.apache.tools.ant.BuildException;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunListener;

public final class ClassLoaderIsolatedTestRunner {

    public ClassLoaderIsolatedTestRunner() {
        // Disallow construction at all from wrong ClassLoader
        ensureLoadedInIsolatedClassLoader(this);
    }

    // Do not rename.
    public void run_invokedReflectively(List<String> testClasses) throws BuildException {
        // Make sure we are not accidentally working in the system CL
        ensureLoadedInIsolatedClassLoader(this);

        // Load classes
        Class<?>[] classes = new Class<?>[testClasses.size()];
        for (int i=0; i<testClasses.size(); i++) {
            String test = testClasses.get(i);
            try {
                classes[i] = Class.forName(test);
            } catch (ClassNotFoundException e) {
                String msg = "Unable to find class file for test ["+test+"]. Make sure all " +
                        "tests sources are either included in this test target via a 'src' " +
                        "declaration.";
                throw new BuildException(msg, e);
            }
        }

        // Run
        JUnitCore junit = new JUnitCore();
        ensureLoadedInIsolatedClassLoader(junit);
        RunListener listener = null;
		junit.addListener(listener);
        junit.run(classes);
    }

    private static void ensureLoadedInIsolatedClassLoader(Object o) {
        String objectClassLoader = o.getClass().getClassLoader().getClass().getName();

        // NB: Can't do instanceof here because they are not instances of each other.
        if (!objectClassLoader.equals(IsolatedURLClassLoader.class.getName())) {
            Object cls = null;
			throw new IllegalStateException(String.format(
                    "Instance of %s not loaded by a IsolatedURLClassLoader (loaded by %s)",
                    cls, objectClassLoader));
        }
    }
}