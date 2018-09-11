package jprogress;


import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ProgressBar2 
{
     WebDriver driver;
     JFrame frame = new JFrame("Test in Progress");
     JButton b = new JButton ("View Report");
     JProgressBar pb = new JProgressBar();
    static int testCount=0;
     static int failcount=0;
     
     @BeforeTest
     public void before() {
           
           final int MAX = 100;
          
     //  frame = new JFrame("Test in Progress");
         JPanel panel=new JPanel();
         panel.setLayout(new FlowLayout());
       //  JLabel label=new JLabel("dff");
         
         // creates progress bar
         pb = new JProgressBar();
         pb.setMinimum(0);
         pb.setMaximum(2);
         pb.setStringPainted(true);
         pb.setForeground(Color.blue);
         

         // add progress bar
         frame.setLayout(new FlowLayout());
         frame.getContentPane().add(pb);

      //   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(300, 150);
         frame.setVisible(true);

       //  b = new JButton ("View Report");
         
         frame.add(panel);
         panel.add(b);
         
//         frame.setSize(300, 150);
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
         // update progressbar
        

     }
        
   @Test
   public void f() {
        System.out.println("First test case");
        testCount++;
       
        String path=("C:\\Users\\M1046899\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
           System.setProperty("webdriver.chrome.driver", path);
           
           driver=new ChromeDriver();
           driver.get("https://www.amazon.in/");
           String title=driver.getTitle();
           pb.setValue(testCount);
                Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/");
                System.out.println(testCount);
             
        
   }
   
   
   
   @Test
   public void f1() {
        testCount++;
        //Assert.assertEquals(12, 13);
        String path=("C:\\Users\\M1046899\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
               System.setProperty("webdriver.chrome.driver", path);
               
                driver=new ChromeDriver();
               driver.get("https://www.amazon.in/");
               String title=driver.getTitle();
               pb.setValue(testCount);
               Assert.assertEquals(driver.getCurrentUrl(),"ww");
        
        System.out.println("Second Test case");
        
   }
   
   
   @Test
   public void f2() {
        testCount++;
        //Assert.assertEquals(12, 13);
        String path=("C:\\Users\\M1046899\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
               System.setProperty("webdriver.chrome.driver", path);
               
                driver=new ChromeDriver();
               driver.get("https://www.amazon.in/");
               String title=driver.getTitle();
               pb.setValue(testCount);
               Assert.assertEquals(driver.getCurrentUrl(),"https://www.amazon.in/");
        
        System.out.println("Second Test case");
        
   }
   
   @AfterTest
   public void after() throws InterruptedException {
         
              //pb.setForeground(Color.red);
              b.addActionListener(new ActionListener() {
                File f1=new File("C:\\Users\\m1047245\\Desktop\\template2.html");
                   public void actionPerformed(ActionEvent e)
                   {
                       //Execute when button is pressed
                       //System.out.println("You clicked the button");
                      try {
                                Desktop.getDesktop().open(f1);
                           } catch (IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                           }
                   }
               });     
               
               frame.getContentPane().add(b);
               //frame.pack();
               frame.setVisible(true);
               pb.setValue(testCount-failcount);
               pb.setForeground(Color.green);
               pb.setBackground(Color.red);
               
               
               Thread.sleep(10000);
              
        }
       @AfterMethod
       public void g(ITestResult res) {
             if(res.getStatus()==ITestResult.FAILURE)
              {
                  failcount++;
                  
                  System.out.println("fail="+failcount);
                
                  
                  
              }
       }
   
}  
