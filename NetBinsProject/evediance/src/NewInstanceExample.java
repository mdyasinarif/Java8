/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class NewInstanceExample {

   int m_x, m_y;

   public NewInstanceExample() {
   }

    public NewInstanceExample(int x, int y) {
      m_x = x;
      m_y = y;
    }

    public static void main(String args[]) {
      NewInstanceExample p = new NewInstanceExample(20,30);
    }
}
