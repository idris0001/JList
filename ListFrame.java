/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listframe;

import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
/**
 *
 * @author Monet
 */
public class ListFrame extends JFrame {
    private JList colorJList; // list to display colors
 private static final String[] colorNames = { "Black", "Blue", "Cyan",

 "Dark Gray", "Gray", "Green", "Light Gray", "Magenta",
 "Orange", "Pink", "Red", "White", "Yellow" };
 private static final Color[] colors = { Color.BLACK, Color.BLUE,
 Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN,
 Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK,
 Color.RED, Color.WHITE, Color.YELLOW };

  //ListFrameconstructoraddJScrollPane containingJList toJFrame
  public ListFrame()
  {
      
  super( "ListTest");
  setLayout( new FlowLayout());// set framelayout
 
   colorJList= new JList(colorNames );//create with colorNames
 colorJList.setVisibleRowCount( 5); // displayfiverows atonce
 
 //donotallowmultipleselections
 colorJList.setSelectionMode( ListSelectionModel.SINGLE_SELECTION);
 
  //adda JScrollPanecontainingJListtoframe
 add( new JScrollPane( colorJList) );
 
  colorJList.addListSelectionListener(
  new ListSelectionListener()// anonymousinnerclass
  {
  //handle list selectionevents
  public void valueChanged( ListSelectionEvent event)
  {
  getContentPane().setBackground(
  colors[colorJList.getSelectedIndex()]);
  }// end methodvalueChanged
        }//end anonymousinnerclass
      ); // endcall toaddListSelectionListener
    } // end ListFrame constructor
  }//end classListFrame
