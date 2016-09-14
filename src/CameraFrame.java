import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;

public class CameraFrame extends JFrame implements ActionListener
{
  CameraFrame() {
    System.loadLibrary( Core.NATIVE_LIBRARY_NAME );
    VideoCapture list = new VideoCapture(0);
    JMenu camera = new JMenu("camera");
    JMenuBar bar = new JMenuBar();
    bar.add(camera);
    int i = 1;
    while(list.isOpened()){
      JMenuItem cam = new JMenuItem("Camera" + i );
      cam.addActionListener(this);
      camera.add(cam);
      list=new VideoCapture(i);
      i++;
      }
    setJMenuBar(bar);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400,400);
    setVisible(true);
    
  }
  
  public static void main(String[] args) {
    CameraFrame cf = new CameraFrame();
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    
  }
   
}