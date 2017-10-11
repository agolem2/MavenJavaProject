package utiity;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
@Ignore
public class listener {
                
               @SuppressWarnings("unused")
               private static String watchedLog;
 
                 @Rule
                 public TestWatcher watchman= new TestWatcher() {
                     @Override
                     protected void failed(Throwable e, Description description) {
                         watchedLog += description + "\n";
                     }
 
                     @Override
                     protected void succeeded(Description description) {
                         watchedLog += description + " " + "success!\n";
                        
                         
                        }
                    };
 
                 @Test
                 @Ignore
                 public void fails() {
                     fail();
                 }
 
                 @Test
                 @Ignore
                 public void succeeds() {
                    }
               }