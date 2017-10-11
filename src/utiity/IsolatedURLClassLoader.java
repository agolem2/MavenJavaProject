package utiity;

import java.net.URL;
import java.net.URLClassLoader;

final class IsolatedURLClassLoader extends URLClassLoader {
    private IsolatedURLClassLoader(URL[] urls) {
        // Prevent delegation to the system class loader.
        super(urls, null);
    }
}
