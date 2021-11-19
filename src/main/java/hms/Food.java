package hms;

import javax.swing.JOptionPane;

/**
 *
 * @author hesed
 */
public class Food extends javax.swing.JFrame {

    /**
     * Creates new form Food
     */
    public Food() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        text_how = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Butt_roomservice = new javax.swing.JRadioButton();
        Butt_restaurant = new javax.swing.JRadioButton();
        Butt_reserve = new javax.swing.JButton();
        text_room = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        text_how.setEnabled(false);

        jLabel1.setText("<식사 서비스 판매 및 추적>");

        jLabel3.setText("결제 방식 :");

        jButton1.setText("뒤로가기");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Butt_roomservice.setText("룸서비스 예약");
        Butt_roomservice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_roomserviceActionPerformed(evt);
            }
        });

        Butt_restaurant.setText("레스토랑 예약");
        Butt_restaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_restaurantActionPerformed(evt);
            }
        });

        Butt_reserve.setText("예약");
        Butt_reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_reserveActionPerformed(evt);
            }
        });

        jLabel2.setText("방 번호 :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "메뉴", "가격", "분류"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_room, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Butt_restaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Butt_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Butt_roomservice, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_how, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text_room, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(Butt_roomservice)
                                .addGap(18, 18, 18)
                                .addComponent(Butt_restaurant))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Butt_reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(text_how, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        dispose();
    }                                        

    private void Butt_roomserviceActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
        //여기서 룸서비스 선택하면 테이블에 룸서비스에 들어갈 메뉴들과 금액 표시, 물론 데이터베이스가 필요
    }                                                

    private void Butt_restaurantActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        //여기서 레스토랑 선택하면 테이블에 레스토랑에 들어갈 메뉴들과 금액 표시, 물론 데이터베이스가 필요
    }                                               

    private void Butt_reserveActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        if(text_room.equals("")){  JOptionPane.showMessageDialog(null, "본인의 룸 번호를 기입해주시기 바랍니다.");} // 방번호가 실제 있는 번호가 아니면 본인 룸 번호를 기입하라는 내용이 필요
        else{
            String [] card = {"카드 선불", "카드 후불", "취소"};
            int num = JOptionPane.showOptionDialog(null, "식사 결제 선택(현금은 안됩니다)", null,
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, card, card[2]);
            if(num == JOptionPane.YES_OPTION){
                //카드로 선불 금액 결제 완료되게 수정, 물론 글로만 해도 될듯
                text_how.setText("카드 선불");
                if (Butt_roomservice.isSelected() && Butt_restaurant.isSelected()){
                 JOptionPane.showMessageDialog(null, "하나만 선택해주세요");
                }
                else if(Butt_restaurant.isSelected()){
                    String [] rest = {"메뉴 1", "메뉴 2", "메뉴 3"};
                    int restcheck = JOptionPane.showOptionDialog(null, "레스토렁의 어느 것을 주문하시겠습니까?", null,
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, rest, rest[2]);
                    if(restcheck == 0){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                    int count = Integer.parseInt(input);
                    if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                    else{
                        // 요금 변수 만들어서 추가시키고
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴1 결제가 완료되어 예약되었습니다.");
                        }
                    }
                    else if (restcheck == 1){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                    int count = Integer.parseInt(input);
                    if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                     else{
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴2 결제가 완료되어 예약되었습니다.");
                     }
                    }
                    else if (restcheck == 2){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                    int count = Integer.parseInt(input);
                     if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                     else{
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴3 결제가 완료되어 예약되었습니다.");
                        }
                    }
                }
                else if (Butt_roomservice.isSelected()) {
                    String [] roomserv = {"메뉴 4", "메뉴 5", "메뉴 6"};
                    int roomservecheck = JOptionPane.showOptionDialog(null, "룸서비스의 어느 것을 주문하시겠습니까?", null,
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, roomserv, roomserv[2]);
                    if(roomservecheck == 0){
                        // 요금 변수 만들어서 추가시키기 실제 결제가 카드 번호 입력 받고 결제 완료
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                         int count = Integer.parseInt(input);
                         if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                   else{
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴4 결제가 완료되어 예약되었습니다.");
                        }
                    }
                    else if (roomservecheck == 1){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                        int count = Integer.parseInt(input);
                        if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                         else{
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴5 결제가 완료되어 예약되었습니다.");
                     }
                    }
                    else if (roomservecheck == 2){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                        int count = Integer.parseInt(input);
                         if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                     else{
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴6 결제가 완료되어 예약되었습니다.");
                        }
                    }
                }
            }
            else if(num == JOptionPane.NO_OPTION){
                //카드로 후불, 즉 체크아웃 할 때 결제 금액에다가 추가 시키기
                text_how.setText("카드 후불");
                if (Butt_roomservice.isSelected() && Butt_restaurant.isSelected()){
                 JOptionPane.showMessageDialog(null, "하나만 선택해주세요");
                }
                else if(Butt_restaurant.isSelected()){
                    String [] rest = {"메뉴 1", "메뉴 2", "메뉴 3"};
                    int restcheck = JOptionPane.showOptionDialog(null, "레스토렁의 어느 것을 주문하시겠습니까?", null,
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, rest, rest[2]);
                    if(restcheck == 0){
                        // // 요금 변수 만들어서 추가시키고 결제 금액에다가 추가시킬것
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                    int count = Integer.parseInt(input);
                    if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                    else{
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴1 결제가 완료되어 예약되었습니다.");
                        }
                    }
                    else if (restcheck == 1){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                    int count = Integer.parseInt(input);
                    if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                    else{
                        // 요금 변수 만들어서 추가시키고 결제 금액에다가 추가시킬것
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴2 결제가 완료되어 예약되었습니다.");
                        }
                    }
                    else if (restcheck == 2){
                    String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                    int count = Integer.parseInt(input);
                    if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                    else{                        
                    // 요금 변수 만들어서 추가시키고 결제 금액에다가 추가시킬것
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴3 결제가 완료되어 예약되었습니다.");
                        }
                    }
                }
                else if (Butt_roomservice.isSelected()) {
                    String [] roomserv = {"메뉴 4", "메뉴 5", "메뉴 6"};
                    int roomservecheck = JOptionPane.showOptionDialog(null, "룸서비스의 어느 것을 주문하시겠습니까?", null,
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, roomserv, roomserv[2]);
                    if(roomservecheck == 0){
                    String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                    int count = Integer.parseInt(input);
                    if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                    else{                        
                        // 요금 변수 만들어서 추가시키기 실제 결제가 카드 번호 입력 받고 결제 완료
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴4 결제가 완료되어 예약되었습니다.");
                        }
                    }
                    else if (roomservecheck == 1){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                        int count = Integer.parseInt(input);
                        if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                        else{
                        // 요금 변수 만들어서 추가시키고 결제 금액에다가 추가시킬것
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴5 결제가 완료되어 예약되었습니다.");
                        }
                    }
                    else if (roomservecheck == 2){
                        String input = JOptionPane.showInputDialog("몇 개를 구매하시겠습니까?");
                        int count = Integer.parseInt(input);
                        if (input == ""){JOptionPane.showMessageDialog(null, "구매 내역이 없습니다..");}
                        else{
                        // 요금 변수 만들어서 추가시키고 결제 금액에다가 추가시킬것
                        String ans_str = (String) JOptionPane.showInputDialog(this, "카드 번호를 입력해주세요", "Input Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                        JOptionPane.showMessageDialog(null, "메뉴6 결제가 완료되어 예약되었습니다.");
                    }
                    }
                }
            }
            else {}
        }
    }                                            

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Food.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Food().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Butt_reserve;
    private javax.swing.JRadioButton Butt_restaurant;
    private javax.swing.JRadioButton Butt_roomservice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField text_how;
    private javax.swing.JTextField text_room;
    // End of variables declaration                   
}
