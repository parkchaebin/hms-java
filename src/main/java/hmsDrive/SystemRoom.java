/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hmsDrive;

import hms.check.CheckInSrc;
import hms.room.Dishtxt;
import hms.textfiles.SystemTextFiles;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LYJ
 */
public class SystemRoom extends javax.swing.JFrame {
    /**
     * Creates new form CheckInSrc
     */
    private ArrayList<String[]> roomArrayList = new ArrayList<>();
    private DefaultTableModel dTbl;
    private int row = -1;
    
    private String roomTypeIdx = "1";
    private String roomType = "Single";
    private String peopleNum = "";
    private String fee = "";
    private String updatePeopleNum = "";
    private String updateFee = "";
    
    public int num;
    
    public SystemRoom() {
        initComponents();
        
        dTbl = (DefaultTableModel) ROOM_TBL.getModel();
        
        //객실 목록 검색
        roomArrayList  = SystemTextFiles.getRoomListTxt();
        
        //테이블에 출력
        for (String[] r : roomArrayList){
            dTbl.insertRow(dTbl.getRowCount(), new Object[]{
                r[0],  //방번호
                r[1],  //인원수
                r[2]   //요금
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ROOM_TYPE_DLG = new javax.swing.JDialog();
        ROOM_TYPE_OK = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ROOM_TYPE_TBL = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        INSERT_DLG = new javax.swing.JDialog();
        INSERT_IDX_FIELD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        INSERT_OK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        UPDATE_DLG = new javax.swing.JDialog();
        ROOM_TYPE_FIELD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        IDX_FIELD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UPDATE_OK = new javax.swing.JButton();
        NUM_FIELD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        FEE_FIELD = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ROOM_TBL = new javax.swing.JTable();
        UPDATE_BTN = new javax.swing.JButton();
        DELETE_BTN = new javax.swing.JButton();
        INSERT_BTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        ROOM_TYPE_DLG.setMinimumSize(new java.awt.Dimension(490, 300));

        ROOM_TYPE_OK.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        ROOM_TYPE_OK.setText("수정");
        ROOM_TYPE_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOM_TYPE_OKActionPerformed(evt);
            }
        });

        ROOM_TYPE_TBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "인덱스", "유형", "인원수", "요금"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ROOM_TYPE_TBL);

        jLabel3.setFont(new java.awt.Font("굴림", 0, 10)); // NOI18N
        jLabel3.setText("※ 인덱스는 객실 번호의 첫번째 숫자를 의미합니다.");

        javax.swing.GroupLayout ROOM_TYPE_DLGLayout = new javax.swing.GroupLayout(ROOM_TYPE_DLG.getContentPane());
        ROOM_TYPE_DLG.getContentPane().setLayout(ROOM_TYPE_DLGLayout);
        ROOM_TYPE_DLGLayout.setHorizontalGroup(
            ROOM_TYPE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ROOM_TYPE_DLGLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(ROOM_TYPE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ROOM_TYPE_DLGLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ROOM_TYPE_DLGLayout.createSequentialGroup()
                        .addGroup(ROOM_TYPE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ROOM_TYPE_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        ROOM_TYPE_DLGLayout.setVerticalGroup(
            ROOM_TYPE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ROOM_TYPE_DLGLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(28, 28, 28)
                .addComponent(ROOM_TYPE_OK)
                .addGap(23, 23, 23))
        );

        INSERT_DLG.setMinimumSize(new java.awt.Dimension(280, 280));

        jLabel7.setText("객실 번호:");

        INSERT_OK.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        INSERT_OK.setText("추가");
        INSERT_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERT_OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout INSERT_DLGLayout = new javax.swing.GroupLayout(INSERT_DLG.getContentPane());
        INSERT_DLG.getContentPane().setLayout(INSERT_DLGLayout);
        INSERT_DLGLayout.setHorizontalGroup(
            INSERT_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INSERT_DLGLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(INSERT_IDX_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, INSERT_DLGLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(INSERT_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        INSERT_DLGLayout.setVerticalGroup(
            INSERT_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(INSERT_DLGLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(INSERT_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(INSERT_IDX_FIELD))
                .addGap(55, 55, 55)
                .addComponent(INSERT_OK)
                .addContainerGap())
        );

        jLabel2.setText("jLabel2");

        UPDATE_DLG.setMinimumSize(new java.awt.Dimension(310, 320));
        UPDATE_DLG.setResizable(false);

        ROOM_TYPE_FIELD.setEditable(false);
        ROOM_TYPE_FIELD.setFocusable(false);
        ROOM_TYPE_FIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ROOM_TYPE_FIELDActionPerformed(evt);
            }
        });

        jLabel5.setText("유형:");

        IDX_FIELD.setEditable(false);
        IDX_FIELD.setFocusable(false);

        jLabel4.setText("인덱스:");

        UPDATE_OK.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        UPDATE_OK.setText("수정");
        UPDATE_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE_OKActionPerformed(evt);
            }
        });

        jLabel8.setText("인원 수:");

        FEE_FIELD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FEE_FIELDActionPerformed(evt);
            }
        });

        jLabel9.setText("요금:");

        javax.swing.GroupLayout UPDATE_DLGLayout = new javax.swing.GroupLayout(UPDATE_DLG.getContentPane());
        UPDATE_DLG.getContentPane().setLayout(UPDATE_DLGLayout);
        UPDATE_DLGLayout.setHorizontalGroup(
            UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                .addGroup(UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(FEE_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(NUM_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ROOM_TYPE_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IDX_FIELD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(UPDATE_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        UPDATE_DLGLayout.setVerticalGroup(
            UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UPDATE_DLGLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(IDX_FIELD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ROOM_TYPE_FIELD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NUM_FIELD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(UPDATE_DLGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(FEE_FIELD))
                .addGap(33, 33, 33)
                .addComponent(UPDATE_OK)
                .addGap(47, 47, 47))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("굴림", 1, 18)); // NOI18N
        jLabel1.setText("객실 관리");

        ROOM_TBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "호실", "인원수", "요금"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ROOM_TBL);

        UPDATE_BTN.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        UPDATE_BTN.setText("수정");
        UPDATE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE_BTNActionPerformed(evt);
            }
        });

        DELETE_BTN.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        DELETE_BTN.setText("삭제");
        DELETE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETE_BTNActionPerformed(evt);
            }
        });

        INSERT_BTN.setFont(new java.awt.Font("굴림", 0, 14)); // NOI18N
        INSERT_BTN.setText("추가");
        INSERT_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERT_BTNActionPerformed(evt);
            }
        });

        jMenu1.setText("메뉴");

        jMenuItem1.setText("뒤로가기");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("종료");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DELETE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(INSERT_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121)
                        .addComponent(UPDATE_BTN, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UPDATE_BTN)
                    .addComponent(DELETE_BTN)
                    .addComponent(INSERT_BTN))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //상단 메뉴바 뒤로가기 버튼
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new System().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    //상단 메뉴바 종료 버튼
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void DELETE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETE_BTNActionPerformed
        // TODO add your handling code here:
        dTbl = (DefaultTableModel) ROOM_TBL.getModel();
        row = ROOM_TBL.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "삭제할 객실을 선택해십시오.");
        } else{
            SystemTextFiles.deleteRoomListTxt((String) dTbl.getValueAt(row, 0));
            
            JOptionPane.showMessageDialog(null, "삭제 완료되었습니다.");
            this.dispose();
            new SystemRoom().setVisible(true);
        }
    }//GEN-LAST:event_DELETE_BTNActionPerformed

    private void UPDATE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE_BTNActionPerformed
        // TODO add your handling code here:
        dTbl = (DefaultTableModel) ROOM_TYPE_TBL.getModel();        
        
        roomArrayList = SystemTextFiles.getRoomTypeListTxt();
        
        //테이블에 출력
        for (String[] r : roomArrayList){
            
            dTbl.insertRow(dTbl.getRowCount(), new Object[]{
                r[0],  //방번호
                r[1],  //유형
                r[2],  //인원수
                r[3]   //요금
            });
        }
        
        ROOM_TYPE_DLG.setVisible(true);
    }//GEN-LAST:event_UPDATE_BTNActionPerformed

    private void INSERT_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERT_BTNActionPerformed
        // TODO add your handling code here:
        INSERT_DLG.setVisible(true);
    }//GEN-LAST:event_INSERT_BTNActionPerformed

    private void ROOM_TYPE_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOM_TYPE_OKActionPerformed
        // TODO add your handling code here:
        dTbl = (DefaultTableModel) ROOM_TYPE_TBL.getModel();
        row = ROOM_TYPE_TBL.getSelectedRow();
        
        if(row == -1){
            JOptionPane.showMessageDialog(null, "수정할 유형을 선택해주십시오.");
        } else{
            //UPDATE_DLG init
            roomTypeIdx = (String) dTbl.getValueAt(row, 0);
            roomType = (String) dTbl.getValueAt(row, 1);
            peopleNum = (String) dTbl.getValueAt(row, 2);
            fee = (String) dTbl.getValueAt(row, 3);
                
            IDX_FIELD.setText(roomTypeIdx);
            ROOM_TYPE_FIELD.setText(roomType);
            NUM_FIELD.setText(peopleNum);
            FEE_FIELD.setText(fee);

            ROOM_TYPE_DLG.dispose();
            UPDATE_DLG.setVisible(true);
        }
        
        
       
    }//GEN-LAST:event_ROOM_TYPE_OKActionPerformed

    private void INSERT_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERT_OKActionPerformed
        // TODO add your handling code here:
        dTbl = (DefaultTableModel) ROOM_TBL.getModel();
        row = ROOM_TBL.getRowCount();
        
        String roomIdx = INSERT_IDX_FIELD.getText();
        
        //유효성 검사
        if(roomIdx.equals("")){
            JOptionPane.showMessageDialog(null, "빈칸을 채워주십시오.");
        } else if (row == 100) {  //호텔이 100개이면
            JOptionPane.showMessageDialog(null, "이 호텔의 객실은 100개로 한정되어있습니다.");
            INSERT_DLG.dispose();
        } else if(!(roomIdx.substring(0,0).matches("[1-5]"))){
            JOptionPane.showMessageDialog(null, "객실 번호는 1~5사이의 번호로 시작되어야합니다.");
        } else {
            SystemTextFiles.setRoomListTxt(roomIdx);
            JOptionPane.showMessageDialog(null, "객실이 추가 되었습니다.");
            INSERT_DLG.dispose();
            this.dispose();
            new SystemRoom().setVisible(true);
        }
       
    }//GEN-LAST:event_INSERT_OKActionPerformed

    private void UPDATE_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE_OKActionPerformed
        // TODO add your handling code here:

        //업데이트
        roomTypeIdx = IDX_FIELD.getText();
        updatePeopleNum = NUM_FIELD.getText();
        updateFee =  FEE_FIELD.getText();
        SystemTextFiles.updateRoomTypeListTxt(roomTypeIdx,updatePeopleNum, updateFee);
        SystemTextFiles.updateRoomListTxt(roomTypeIdx, updatePeopleNum, updateFee);
        
        JOptionPane.showMessageDialog(null, "수정 완료되었습니다.");
        UPDATE_DLG.dispose();
        ROOM_TYPE_DLG.dispose();
        this.dispose();
        new SystemRoom().setVisible(true);
    }//GEN-LAST:event_UPDATE_OKActionPerformed

    private void ROOM_TYPE_FIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ROOM_TYPE_FIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ROOM_TYPE_FIELDActionPerformed

    private void FEE_FIELDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FEE_FIELDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FEE_FIELDActionPerformed

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
            java.util.logging.Logger.getLogger(CheckInSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckInSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckInSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckInSrc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE_BTN;
    private javax.swing.JTextField FEE_FIELD;
    private javax.swing.JTextField IDX_FIELD;
    private javax.swing.JButton INSERT_BTN;
    private javax.swing.JDialog INSERT_DLG;
    private javax.swing.JTextField INSERT_IDX_FIELD;
    private javax.swing.JButton INSERT_OK;
    private javax.swing.JTextField NUM_FIELD;
    private javax.swing.JTable ROOM_TBL;
    private javax.swing.JDialog ROOM_TYPE_DLG;
    private javax.swing.JTextField ROOM_TYPE_FIELD;
    private javax.swing.JButton ROOM_TYPE_OK;
    private javax.swing.JTable ROOM_TYPE_TBL;
    private javax.swing.JButton UPDATE_BTN;
    private javax.swing.JDialog UPDATE_DLG;
    private javax.swing.JButton UPDATE_OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}