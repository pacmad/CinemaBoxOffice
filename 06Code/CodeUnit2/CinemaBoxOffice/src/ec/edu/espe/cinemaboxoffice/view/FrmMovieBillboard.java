/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.MovieRecord;
import ec.edu.espe.cinemaboxoffice.model.CinemaRoom;
import ec.edu.espe.cinemaboxoffice.model.MovieBillboard;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Alisson Clavijo
 */
public class FrmMovieBillboard extends javax.swing.JFrame {
    private class PosterContext {
        public File path;
        public BufferedImage image;
    }
    
    private PosterContext posterContext;
    
    /**
     * Creates new form FrmMovieBillboard
     */
    public FrmMovieBillboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMovieBillboard = new javax.swing.JPanel();
        lblMovieBillboard = new javax.swing.JLabel();
        lblBillboardDate = new javax.swing.JLabel();
        lblBillboardPrice = new javax.swing.JLabel();
        lblBillboardRoom = new javax.swing.JLabel();
        cbxBillboardRoom = new javax.swing.JComboBox<>();
        btnBillboardSave = new javax.swing.JButton();
        lblBillboardTitle = new javax.swing.JLabel();
        lblBillboardGender = new javax.swing.JLabel();
        lblBillboardAge = new javax.swing.JLabel();
        txtPrice = new java.awt.TextField();
        cbxAgeRestriction = new javax.swing.JComboBox<>();
        txtTitle = new java.awt.TextField();
        cbxBillboardGender = new javax.swing.JComboBox<>();
        lblBillboardDuration = new javax.swing.JLabel();
        spnDuration = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        btnBillboardExit = new javax.swing.JButton();
        cbxBillboardHour = new javax.swing.JComboBox<>();
        cbxBillboardMin = new javax.swing.JComboBox<>();
        lblBillboardHour = new javax.swing.JLabel();
        lblBillboardMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSinopsis = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dtcDateMovie = new com.toedter.calendar.JDateChooser();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        txtPosterFile = new javax.swing.JTextField();
        btnChoosePosterFile = new javax.swing.JButton();
        lblPoster = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Movie Billboard");

        pnlMovieBillboard.setBackground(new java.awt.Color(0, 0, 51));

        lblMovieBillboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMovieBillboard.setForeground(new java.awt.Color(255, 255, 255));
        lblMovieBillboard.setText("Movie Billboard");

        lblBillboardDate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBillboardDate.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardDate.setText("Date:");

        lblBillboardPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBillboardPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardPrice.setText("Price:");

        lblBillboardRoom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBillboardRoom.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardRoom.setText("Room:");

        cbxBillboardRoom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        btnBillboardSave.setText("Save");
        btnBillboardSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillboardSaveMouseClicked(evt);
            }
        });
        btnBillboardSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBillboardSaveActionPerformed(evt);
            }
        });

        lblBillboardTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBillboardTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardTitle.setText("Title:");

        lblBillboardGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBillboardGender.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardGender.setText("Gender:");

        lblBillboardAge.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBillboardAge.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardAge.setText("Age Restriction:");

        cbxAgeRestriction.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All public", "Over 12", "Over 18" }));

        cbxBillboardGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Science fiction", "Romance", "Comedy", "Family", "Fantasy", "Action", "Horror" }));

        lblBillboardDuration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBillboardDuration.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardDuration.setText("Duration:");

        spnDuration.setModel(new javax.swing.SpinnerNumberModel(1, 1, 300, 1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/cinema logo.png"))); // NOI18N

        btnBillboardExit.setText("Exit");
        btnBillboardExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBillboardExitMouseClicked(evt);
            }
        });

        cbxBillboardHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        cbxBillboardMin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "15", "30", "45" }));

        lblBillboardHour.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardHour.setText("hour");

        lblBillboardMin.setForeground(new java.awt.Color(255, 255, 255));
        lblBillboardMin.setText("min");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("min");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Synopsis");

        txaSinopsis.setColumns(20);
        txaSinopsis.setLineWrap(true);
        txaSinopsis.setRows(5);
        txaSinopsis.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txaSinopsis);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/titleIcon.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/seatIcon.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/priceIcon.png"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/ageIcon.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/genderIcon.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/calendarIcon.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/durationIcon.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/synopsisIcon.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/posterIcon.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(16, 16, 90));
        jSeparator1.setForeground(new java.awt.Color(16, 16, 90));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Poster file:");

        txtPosterFile.setEnabled(false);

        btnChoosePosterFile.setText("Choose");
        btnChoosePosterFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoosePosterFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMovieBillboardLayout = new javax.swing.GroupLayout(pnlMovieBillboard);
        pnlMovieBillboard.setLayout(pnlMovieBillboardLayout);
        pnlMovieBillboardLayout.setHorizontalGroup(
            pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7)
                        .addGap(154, 154, 154)
                        .addComponent(lblMovieBillboard, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMovieBillboardLayout.createSequentialGroup()
                                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGap(3, 3, 3)))))
                        .addGap(18, 18, 18)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnBillboardSave, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBillboardExit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBillboardAge)
                                            .addComponent(lblBillboardTitle)
                                            .addComponent(lblBillboardPrice)
                                            .addComponent(lblBillboardRoom)
                                            .addComponent(lblBillboardDuration))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                                        .addComponent(spnDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel1))
                                                    .addComponent(cbxBillboardGender, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cbxBillboardRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbxAgeRestriction, 0, 162, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(72, 72, 72))
                                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblBillboardGender)
                                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                                .addComponent(lblBillboardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                                .addComponent(dtcDateMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(27, 27, 27)
                                        .addComponent(cbxBillboardHour, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblBillboardHour, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbxBillboardMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblBillboardMin)
                                        .addGap(31, 31, 31)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                        .addComponent(txtPosterFile)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnChoosePosterFile, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel13))
                                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                                                    .addComponent(jLabel11)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(24, 24, 24))
        );
        pnlMovieBillboardLayout.setVerticalGroup(
            pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblMovieBillboard)))
                .addGap(19, 19, 19)
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(lblBillboardTitle)))
                        .addGap(25, 25, 25)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardRoom)
                                .addComponent(cbxBillboardRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardAge)
                                .addComponent(cbxAgeRestriction, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(24, 24, 24)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(lblBillboardPrice)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardGender)
                                .addComponent(cbxBillboardGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxBillboardHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxBillboardMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBillboardHour)
                                .addComponent(lblBillboardMin)
                                .addComponent(jLabel9))
                            .addComponent(dtcDateMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblBillboardDuration)
                                .addComponent(spnDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)))
                        .addGap(27, 27, 27))
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addGap(16, 16, 16))
                    .addGroup(pnlMovieBillboardLayout.createSequentialGroup()
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPosterFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnChoosePosterFile))
                        .addGap(18, 18, 18)
                        .addComponent(lblPoster, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(pnlMovieBillboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBillboardSave)
                    .addComponent(btnBillboardExit))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlMovieBillboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMovieBillboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBillboardExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillboardExitMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_btnBillboardExitMouseClicked

    private void btnBillboardSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBillboardSaveMouseClicked
        
    }//GEN-LAST:event_btnBillboardSaveMouseClicked

    private void btnChoosePosterFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoosePosterFileActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter(
            "Image files", ImageIO.getReaderFileSuffixes());
        fileChooser.setFileFilter(imageFilter);
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);
        fileChooser.setAcceptAllFileFilterUsed(false);
        int selection = fileChooser.showOpenDialog(this);
        
        if (selection == JFileChooser.APPROVE_OPTION) {
            File imageFile = fileChooser.getSelectedFile();
            BufferedImage bufferedImage = null;

            try {
                bufferedImage = ImageIO.read(imageFile);
                
                if (bufferedImage == null) {
                    JOptionPane.showMessageDialog(
                        getRootPane(),
                        "Selected file is not a valid image or has an invalid format",
                        "Wrong image format",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                
                if (bufferedImage.getWidth() < 100 || bufferedImage.getHeight() < 148) {
                    JOptionPane.showMessageDialog(
                        getRootPane(),
                        "Image size must be greater than or equal to 100x148",
                        "Image too small",
                        JOptionPane.ERROR_MESSAGE
                    );
                    return;
                }
                
                Image scaled = bufferedImage.getScaledInstance(100, 148, Image.SCALE_SMOOTH);


                BufferedImage bimage = new BufferedImage(
                    scaled.getWidth(null), scaled.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                Graphics2D bGr = bimage.createGraphics();
                bGr.drawImage(scaled, 0, 0, null);
                bGr.dispose();
                
                PosterContext context = new PosterContext();
                context.image = bimage;
                context.path = imageFile;
                
                lblPoster.setIcon(new ImageIcon(bimage));
                txtPosterFile.setText(imageFile.getAbsolutePath());
                
                posterContext = context;
            } catch (IOException exception) {}
        }
    }//GEN-LAST:event_btnChoosePosterFileActionPerformed

    private void btnBillboardSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBillboardSaveActionPerformed
        MovieRecord record = new MovieRecord();
        String title = txtTitle.getText();
        String gender = cbxBillboardGender.getSelectedItem().toString();
        String age = cbxAgeRestriction.getSelectedItem().toString();
        String sPrice = txtPrice.getText();
        int duration = Integer.parseInt(spnDuration.getValue().toString());
        //String namePoster = txtPoster.getText() + ".jpg";
        int roomNumber = Integer.parseInt(cbxBillboardRoom.getSelectedItem().
                toString());
        String sinopsis = txaSinopsis.getText();

        if (title.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Titles are required!", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else if (!title.matches("^[ A-Za-z0-9]+$")) {
            JOptionPane.showMessageDialog(
                    null, "Special characters are not allowed on titles",
                    "Error", JOptionPane.ERROR_MESSAGE);
            txtTitle.setText("");
            return;
        }
        
        if (posterContext == null) {
            JOptionPane.showMessageDialog(
                    null, "Please select a poster to this movie",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String posterName = "";
        
        try {
            posterName = title.replace(" ", "_").toLowerCase();
            File outputPoster = new File("pictures/" + posterName + ".jpg");
            ImageIO.write(posterContext.image, "jpg", outputPoster);
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(
                    null, "Error saving poster image, please try again",
                    "Error", JOptionPane.ERROR_MESSAGE);
            exception.printStackTrace();
            return;
        }

        float price = Float.parseFloat(sPrice);

        CinemaRoom room = new CinemaRoom(roomNumber, record.
                defineRoom(roomNumber), CinemaRoom.buildSeat());
        MovieBillboard movie = new MovieBillboard(title, gender, age, duration,
                posterName + ".jpg", sinopsis, recordDate(), price, room);
        
        try {
            record.recordMovie("Billboard.json", movie);
        } catch (IOException ex) {
            ex.printStackTrace();
            Logger.getLogger(FrmMovieBillboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(null, "your movie has been registered", 
                "Registered movie ", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_btnBillboardSaveActionPerformed

    public Date recordDate() {
        int year = dtcDateMovie.getDate().getYear();
        int month = dtcDateMovie.getDate().getMonth();
        int day = dtcDateMovie.getDate().getDay() + 9;
        int hour = Integer.parseInt(cbxBillboardHour.getSelectedItem().toString());
        int minute = Integer.parseInt(cbxBillboardMin.getSelectedItem().toString());
        return new Date(year, month, day, hour, minute);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBillboardExit;
    private javax.swing.JButton btnBillboardSave;
    private javax.swing.JButton btnChoosePosterFile;
    private javax.swing.JComboBox<String> cbxAgeRestriction;
    private javax.swing.JComboBox<String> cbxBillboardGender;
    private javax.swing.JComboBox<String> cbxBillboardHour;
    private javax.swing.JComboBox<String> cbxBillboardMin;
    private javax.swing.JComboBox<String> cbxBillboardRoom;
    private com.toedter.calendar.JDateChooser dtcDateMovie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBillboardAge;
    private javax.swing.JLabel lblBillboardDate;
    private javax.swing.JLabel lblBillboardDuration;
    private javax.swing.JLabel lblBillboardGender;
    private javax.swing.JLabel lblBillboardHour;
    private javax.swing.JLabel lblBillboardMin;
    private javax.swing.JLabel lblBillboardPrice;
    private javax.swing.JLabel lblBillboardRoom;
    private javax.swing.JLabel lblBillboardTitle;
    private javax.swing.JLabel lblMovieBillboard;
    private javax.swing.JLabel lblPoster;
    private javax.swing.JPanel pnlMovieBillboard;
    private javax.swing.JSpinner spnDuration;
    private javax.swing.JTextArea txaSinopsis;
    private javax.swing.JTextField txtPosterFile;
    private java.awt.TextField txtPrice;
    private java.awt.TextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
