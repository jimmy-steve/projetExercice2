package org.example.controle;
import org.example.modele.RegistreEmploye;
import org.example.ui.FenPrincipale;

/**
 * Hello world!
 */
public class App {
    
        /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        final RegistreEmploye registre = new RegistreEmploye();

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
            java.util.logging.Logger.getLogger(FenPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FenPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FenPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FenPrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FenPrincipale(registre).setVisible(true);
            }
        });
    }
    
    
    

    
//    public static void main(String[] args) {
//        RegistreEmploye registre = new RegistreEmploye();
//
////        ManipFichier.seConnecterBD();
//
////        try {
////            ManipFichier.afficherTableEmploye();
////        } catch (SQLException sqlException) {
////            System.out.println(sqlException);
////        }
//        System.out.println("======================================");
//
////        try {
////            ManipFichier.afficherResultatQuestion();
////        } catch (SQLException sqlException) {
////            System.out.println(sqlException);
////        }
//        System.out.println("======================================");
//
//
//        //----------------------------------------------------------------test
//        Employe emp = new Employe("Lacrasse", "Jonathan", "lacrasse@email.ca", "Legal", 75000.00);
//
//        registre.ajouterEmploye(emp);
//
//
//        //----------------------------------------------------------------ajouter un employe dans la base de donnée
//        try {
//            registre.ajouterEmployeJDBC(emp.getPrenom(), emp.getNom(), emp.getEmail(), emp.getDepartement(), emp.getSalaire());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
////----------------------------------------------------------------ajouter un employe dans la base de donnée
//
//
//
//
//    }
    
    
}
