
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class myFrame extends javax.swing.JFrame {

    public Shape shape;
    public double Wx,Wy,LR,TH,YA,YP,error,d;
    public double epoch;
    public Point tempPoint;
    public ArrayList<Shape>myShapes ,normalized;
    double x1 ,x2 ,y2, y1;
    
    
    public myFrame() {
        initComponents();
         p1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                testPoint = e.getPoint();
            }
        });
    
        shape=new Shape();
        myShapes = new ArrayList<Shape>();
        normalized = new ArrayList<Shape>();
        
        if(Classes.getSelectedIndex()==0)
        {
            circle.setEnabled(false);
            triangle.setEnabled(false);
            square.setEnabled(false);
            polygon.setEnabled(false);
            Wx=0;
            Wy=0;
            
            error=0;
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        p1 = new myPanel();
        circle = new javax.swing.JRadioButton();
        triangle = new javax.swing.JRadioButton();
        square = new javax.swing.JRadioButton();
        polygon = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Classes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Classify = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Learning rate:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Papyrus", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Binary &Multi Classification");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, 53));

        p1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 4));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 590, 360));

        circle.setBackground(new java.awt.Color(255, 51, 102));
        bg1.add(circle);
        circle.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        circle.setText("Circle");
        circle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circleActionPerformed(evt);
            }
        });
        jPanel1.add(circle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 117, -1));

        triangle.setBackground(new java.awt.Color(255, 51, 102));
        bg1.add(triangle);
        triangle.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        triangle.setText("Triangle");
        jPanel1.add(triangle, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 117, -1));

        square.setBackground(new java.awt.Color(255, 51, 102));
        bg1.add(square);
        square.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        square.setText("Square");
        jPanel1.add(square, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 117, -1));

        polygon.setBackground(new java.awt.Color(255, 51, 102));
        bg1.add(polygon);
        polygon.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        polygon.setText("Polygon");
        jPanel1.add(polygon, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 480, 117, -1));

        jLabel5.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Learning rate:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, 35));

        jTextField1.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jTextField1.setText("0.1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 540, 136, 35));

        jLabel2.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("# Classes :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, -1, 35));

        Classes.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        Classes.setForeground(new java.awt.Color(0, 0, 102));
        Classes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "2", "3", "4" }));
        Classes.setToolTipText("");
        Classes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassesActionPerformed(evt);
            }
        });
        jPanel1.add(Classes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 92, 35));

        jLabel3.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("# Of Epoch :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 540, -1, 35));

        jTextField3.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 102));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 540, 80, 35));

        jLabel6.setFont(new java.awt.Font("Papyrus", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Goal :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 540, 84, 36));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, 90, 36));

        Clear.setBackground(new java.awt.Color(255, 51, 102));
        Clear.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClearMouseClicked(evt);
            }
        });
        jPanel1.add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, 189, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 102));
        jButton1.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 620, 190, 40));

        Classify.setBackground(new java.awt.Color(255, 51, 102));
        Classify.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        Classify.setText("Classify");
        Classify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClassifyMouseClicked(evt);
            }
        });
        Classify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClassifyActionPerformed(evt);
            }
        });
        jPanel1.add(Classify, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 620, 176, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deep-learning-illustration-generative-ai-scaled.jpg"))); // NOI18N
        jLabel7.setMaximumSize(new java.awt.Dimension(1000, 2000));
        jLabel7.setMinimumSize(new java.awt.Dimension(1000, 2000));
        jLabel7.setPreferredSize(new java.awt.Dimension(1000, 2000));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 720));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private Point testPoint;
    private void p1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseClicked

    p1.draw(shape);
    ///////
       shape = new Shape();
         Point p =new Point();
        int myx = evt.getX();
        int myy=evt.getY();
        p.x=myx;
        p.y=myy;
        shape.setX(myx);
        shape.setY(myy);

       
       

        if(circle.isSelected())
            shape.setType("circle");

        else if(triangle.isSelected())
            shape.setType("triangle");


        else if (square.isSelected())
            shape.setType("square");


        else  if(polygon.isSelected())
            shape.setType("polygon");

        myShapes.add(shape);
        p1.draw(shape);
    }//GEN-LAST:event_p1MouseClicked

    private void circleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_circleActionPerformed

    private void ClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassesActionPerformed
        if(Classes.getSelectedIndex()==1)
        {
            circle.setEnabled(true);
            triangle.setEnabled(true);
            square.setEnabled(false);
            polygon.setEnabled(false);
        }
        
        if(Classes.getSelectedIndex()==2)
        {
            circle.setEnabled(true);
            triangle.setEnabled(true);
            square.setEnabled(true);
            polygon.setEnabled(false);
        }
        
        if(Classes.getSelectedIndex()==3)
        {
            circle.setEnabled(true);
            triangle.setEnabled(true);
            square.setEnabled(true);
            polygon.setEnabled(true);
        }
    }//GEN-LAST:event_ClassesActionPerformed

    private void ClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClearMouseClicked
        circle.setEnabled(false);
        triangle.setEnabled(false);
        square.setEnabled(false);
        polygon.setEnabled(false); 
        Classes.setSelectedIndex(0);
        Wx=0;
        Wy=0;
        TH=0;
        LR=0;
        error=0;
        epoch=0;
        
        
        myShapes.clear();
        normalized.clear();
        p1.clear();
        
    }//GEN-LAST:event_ClearMouseClicked

    private void ClassifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClassifyMouseClicked
     
      p1.clearLines();
        LR=Double.parseDouble(jTextField1.getText());
        epoch=Integer.parseInt(jTextField3.getText());
        double max=2.4/2;
        double min=-2.4/2;
        double range = (max - min) + 1;     
        TH= (int)(Math.random() * range) + min;
        Wx=(int)(Math.random() * range) + min;
        Wy=(int)(Math.random() * range) + min;
        
         if(Classes.getSelectedIndex()==1)
        {   
            
            Perceptron("circle");
            getPoints();
            p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
        }
        
        if(Classes.getSelectedIndex()==2)
        {
            Perceptron("circle");
            getPoints();
           p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
              LR=Double.parseDouble(jTextField1.getText());
        epoch=Integer.parseInt(jTextField3.getText());
             TH= (int)(Math.random() * range) + min;
        Wx=(int)(Math.random() * range) + min;
        Wy=(int)(Math.random() * range) + min;
        
            Perceptron("triangle");
            getPoints();
             p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
              LR=Double.parseDouble(jTextField1.getText());
        epoch=Integer.parseInt(jTextField3.getText());
             TH= (int)(Math.random() * range) + min;
        Wx=(int)(Math.random() * range) + min;
        Wy=(int)(Math.random() * range) + min;
        
            Perceptron("square");
            getPoints();
            p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
        }
        
        if(Classes.getSelectedIndex()==3)
        {
           
            Perceptron("circle");
          
            getPoints();
            p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
            
              LR=Double.parseDouble(jTextField1.getText());
        epoch=Integer.parseInt(jTextField3.getText());
             TH= (int)(Math.random() * range) + min;
        Wx=(int)(Math.random() * range) + min;
        Wy=(int)(Math.random() * range) + min;
            
            
            Perceptron("triangle");
           
            getPoints();
           
           
            
            p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
               LR=Double.parseDouble(jTextField1.getText());
        epoch=Integer.parseInt(jTextField3.getText());
             TH= (int)(Math.random() * range) + min;
        Wx=(int)(Math.random() * range) + min;
        Wy=(int)(Math.random() * range) + min;
            
            
            Perceptron("square");
          
            getPoints();
           
           
            
            p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
               LR=Double.parseDouble(jTextField1.getText());
        epoch=Integer.parseInt(jTextField3.getText());
             TH= (int)(Math.random() * range) + min;
        Wx=(int)(Math.random() * range) + min;
        Wy=(int)(Math.random() * range) + min;
            
            Perceptron("polygon");
          
            getPoints();
           
           
            
            p1.drawLine((int)x1,(int)y1,(int) x2, (int)y2);
            
               LR=Double.parseDouble(jTextField1.getText());
        epoch=Integer.parseInt(jTextField3.getText());
            TH= (int)(Math.random() * range) + min;
        Wx=(int)(Math.random() * range) + min;
        Wy=(int)(Math.random() * range) + min;
            
            
            
        }
    }//GEN-LAST:event_ClassifyMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void ClassifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClassifyActionPerformed
        // TODO add your handling code here:
         if(jTextField3.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Make sure to:\n - Enter Max epochs/iterations \n - Choose the # of classes \n - Enter the acceptable error value", "Warning", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_ClassifyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      testShape();
                   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
  private void testShape() {
    if (testPoint != null) {
        Shape testShape = new Shape();
        testShape.setX(testPoint.getX());
        testShape.setY(testPoint.getY());

        if (circle.isSelected())
            testShape.setType("circle");
        else if (triangle.isSelected())
            testShape.setType("triangle");
        else if (square.isSelected())
            testShape.setType("square");
        else if (polygon.isSelected())
            testShape.setType("polygon");

        JOptionPane.showMessageDialog(this, "The determined shape is: " + testShape.getType());
    } else {
        JOptionPane.showMessageDialog(this, "Please click on the shape before testing.", "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
       public void getPoints(){
    
    double m = -Wx/Wy;
    double c = TH/Wy;
    double tmpX1 , tmpX2;
    tmpX1 = normalizeX(0.0);
    tmpX2 = normalizeX(670.0);
    
    y1 = m*tmpX1 +c;
    y2 = m*tmpX2 +c ;
   
    
    x1 = deNormalizeX(tmpX1);
    x2 = deNormalizeX(tmpX2);
    
    y1 = deNormalizeX(y1);
    y2 = deNormalizeX(y2);
    
    }
    
    
     
       
       
        public void Perceptron(String Type)
    {
         int counter =0 ;
      int counterOfEpoch = 0; 
        for (Shape array : myShapes){
            Shape Ns = new Shape();
            Ns.type = array.type;
            Ns.x = normalizeX(array.x);
            Ns.y = normalizeY(array.y);
            normalized.add(Ns);
        }
       
       for(int i=0;i<epoch;i++){
         if (counter ==0){
         for (Shape S : normalized){
         double x , y ; 
         x = S.x ; 
         y = S.y ;
         boolean b = S.getType().equals(Type);
         YA = Sign((x*Wx) + (y*Wy) - TH);
          
          
         if (b) YP=1;
         else  YP=-1;
      // E = YD-YA;
        error = YP-YA;
         if (error != 0){
                counter = 0; 
                d=LR*x*error;
                 Wx=Wx+d;
                d=LR*y*error;
                 Wy=Wy+d;
                d=LR*-1*error;
               
                TH=TH+d;
            }
         else counter++;
         }}
        else if (counter+1 >=normalized.size())
            break;
       }   
        
   

     

    
    }
       
       
     
         
        
    public double normalizeX(double in ){
   
        
         double iMin =0, iMaxX = 680,iMaxY = 375, Nmax =1, Nmin=-1 ;
        double InX = ( (in - iMin) *( (Nmax -Nmin)/(iMaxX-iMin)) + Nmin);
       
        return InX;
    
    }
    
    
      public double normalizeY(double in ){

        double iMin =0, iMaxX = 680,iMaxY = 375, Nmax =1, Nmin=-1 ;
        double InY = ( (in - iMin) *( (Nmax -Nmin)/(iMaxY-iMin)) + Nmin);
        return InY;
    
    }
      
      
      
    public double deNormalizeX (double in ){
 
   double Nmin=-1, Nmax=1 , Omaxx=680 , Omin=0,  Omaxy = 375;
    double On= in;
    double OX =  ((On - Nmin )*((Omaxx - Omin)/(Nmax-Nmin)) + Omin);
     return OX;
  
    }  
    
    
        public int Sign (double x){
    
        if(x<=0)
          return -1;
       
        else
          return 1;
    }
    
   
    
    
       public double deNormalizeY (double in ){
       
   
    
    double Nmin=-1, Nmax=1 , Omaxx=680 , Omin=0,  Omaxy = 375;
    double On= in;
     double OY =  ((On - Nmin )*((Omaxy - Omin)/(Nmax-Nmin)) + Omin);
     return OY;
    }  
    
       
    
    public int Step(double x)
    {
        if(x<=0)
          return -1;
       
        else
          return 1;
        
        
        
    }
    
   
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Classes;
    private javax.swing.JButton Classify;
    private javax.swing.JButton Clear;
    private javax.swing.ButtonGroup bg1;
    private javax.swing.JRadioButton circle;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private myPanel p1;
    private javax.swing.JRadioButton polygon;
    private javax.swing.JRadioButton square;
    private javax.swing.JRadioButton triangle;
    // End of variables declaration//GEN-END:variables
}
