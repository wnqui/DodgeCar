# DodgeCar
躲避賽車遊戲<半成品>  

Java練習，2D物件碰撞練習。

出線與碰練習  

筆記：  
判斷車子是否超出馬路  
  設直線是由其上兩點(x1,y1)，(x2,y2)確定的，直線方向是由(x1,y1)到(x2,y2)的方向。  
  假設直線方程為：Ax+By+C=0，則有：  
　　　　A=y2-y1; B=x1-x2; C=x2*y1-x1*y2;  
  這時可以通過計算D，來判斷點P是在直線的哪一側：  
　　　　D=A*xp+B*yp+C  
  若D<0，則點P在直線的左側；若D>0，則點P在直線的右側；若D＝0，則點P在直線上。  
  <p.s.直線有方向性>  

![image](https://github.com/wnqui/DodgeCar/blob/master/DodgeCar.jpg)
