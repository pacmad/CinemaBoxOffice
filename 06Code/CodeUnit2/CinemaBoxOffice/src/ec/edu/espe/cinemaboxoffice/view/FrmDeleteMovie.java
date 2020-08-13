/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cinemaboxoffice.view;

import ec.edu.espe.cinemaboxoffice.controller.MovieDaily;
import ec.edu.espe.cinemaboxoffice.controller.MovieRecord;
import ec.edu.espe.cinemaboxoffice.model.CinemaRoom;
import ec.edu.espe.cinemaboxoffice.model.Movie;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alisson Clavijo
 */
public class FrmDeleteMovie extends javax.swing.JFrame {

    /**
     * Creates new form FrmDeleteMovie
     */
    public FrmDeleteMovie() {
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

        jPanel1 = new javax.swing.JPanel();
        lblDeleteMovie = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewMoviesDelete = new javax.swing.JTable();
        btnDeleteMovie = new javax.swing.JButton();
        btnDeleteMovieExit = new javax.swing.JButton();
        lblTitleMovie = new javax.swing.JLabel();
        txfTitleMovie = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Delete Movie");

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        lblDeleteMovie.setFont(new java.awt.Font("Comic Sans MS", 3, 20)); // NOI18N
        lblDeleteMovie.setForeground(new java.awt.Color(255, 255, 255));
        lblDeleteMovie.setText("Delete Movie");

        tblViewMoviesDelete.setBorder(new javax.swing.border.MatteBorder(null));
        tblViewMoviesDelete.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tblViewMoviesDelete.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title ", "Date", "Room"
            }
        ));
        jScrollPane1.setViewportView(tblViewMoviesDelete);

        btnDeleteMovie.setText("Delete");
        btnDeleteMovie.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMovieMouseClicked(evt);
            }
        });

        btnDeleteMovieExit.setText("Exit");
        btnDeleteMovieExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMovieExitMouseClicked(evt);
            }
        });

        lblTitleMovie.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblTitleMovie.setForeground(new java.awt.Color(255, 255, 255));
        lblTitleMovie.setText("Title Movie:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/smallCinemaLogo.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/espe/cinemaboxoffice/pictures/titleIcon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblTitleMovie)
                                .addGap(18, 18, 18)
                                .addComponent(txfTitleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111)
                                .addComponent(lblDeleteMovie)))
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteMovie)
                .addGap(124, 124, 124)
                .addComponent(btnDeleteMovieExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblDeleteMovie)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTitleMovie)
                        .addComponent(txfTitleMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteMovie)
                    .addComponent(btnDeleteMovieExit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteMovieMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMovieMouseClicked
        MovieRecord record = new MovieRecord();
        try {
            record.deleteMovie("Billboard.json", txfTitleMovie.getText());
            JOptionPane.showMessageDialog(null, "the movie was deleted",
                    "Delete movie ", JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (IOException ex) {
            Logger.getLogger(FrmDeleteMovie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeleteMovieMouseClicked

    private void btnDeleteMovieExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMovieExitMouseClicked
        dispose();
    }//GEN-LAST:event_btnDeleteMovieExitMouseClicked

    public void showListMovies(String fileName) throws IOException {
        CinemaRoom room;
        ArrayList<Movie> movies = Movie.consultMovies(fileName);
        for (int i = 0; i < movies.size(); i++) {
            room = movies.get(i).getRoom();
            tblViewMoviesDelete.setValueAt(movies.get(i).getTitle(), i, 0);
            tblViewMoviesDelete.setValueAt(movies.get(i).getDate(), i, 1);
            tblViewMoviesDelete.setValueAt(room.getRoomNumber(), i, 2);
        }
    }

    public void showListNextPremieres(String fileName) throws IOException {
        ArrayList<Movie> movies;
        movies = MovieDaily.getMoviesForMonths(Movie.consultNextPremier(fileName), new Date().getMonth());
        for (int i = 0; i < movies.size(); i++) {
            tblViewMoviesDelete.setValueAt(movies.get(i).getTitle(), i, 0);
            tblViewMoviesDelete.setValueAt(movies.get(i).getDate(), i, 1);
            tblViewMoviesDelete.setValueAt("-" , i, 2);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteMovie;
    private javax.swing.JButton btnDeleteMovieExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDeleteMovie;
    private javax.swing.JLabel lblTitleMovie;
    private javax.swing.JTable tblViewMoviesDelete;
    private javax.swing.JTextField txfTitleMovie;
    // End of variables declaration//GEN-END:variables
}
