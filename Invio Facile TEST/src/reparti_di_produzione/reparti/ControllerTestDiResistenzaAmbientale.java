package reparti_di_produzione.reparti;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import util_package.Util;

public class ControllerTestDiResistenzaAmbientale {
	
	@FXML
	public void initialize() {
//		DATI FABBRICAZIONE E MONTAGGIO
		String totaleCostiNow = String.valueOf( Util.costiTotaliTestDiResistenzaAmbientale() );
		totaleCosti.setText(totaleCostiNow);
		String totaleAvereNow = String.valueOf( Util.ricaviTotaliTestDiResistenzaAmbientale());
		totaleRicavi.setText(totaleAvereNow);
		String totaleVociNow = String.valueOf( Util.vociTotaliTestDiResistenzaAmbientale());
		vociTotali.setText(totaleVociNow);
	}

    @FXML
    private ScrollPane scrollPaneTestDIResistenzaAmbientale;
	    @FXML
	    private AnchorPane anchorPaneBase;
			@FXML
		    private BorderPane borderPaneBase;
				@FXML
			    private HBox hBoxTestDiResistenzaAmbientale;
					@FXML
				    private ImageView immagineTestDiResistenzaAmbientale;
						@FXML
					    private BorderPane borderPaneTitolo;
							@FXML
						    private Label labelTestDiResistenzaAmbientale;
				@FXML
			    private VBox vBoxContenuto;
					@FXML
				    private BorderPane borderPaneDescrizioneReparto;
						@FXML
					    private Label labelDescrizioneReparto;
							@FXML
						    private TextArea textAreaDescrizione;
					@FXML
				    private BorderPane borderPaneDipendentiEOperai;
						@FXML
					    private Label labelDipendentiEOperai;
						@FXML
					    private GridPane gridPaneDipendentiEOperai;
							@FXML private Label titolareRepartoLabel; @FXML private Label titolareReparto;
							@FXML private Label dipendentiLabel; @FXML private Label dipendenti;
							@FXML private Label operaiLabel; @FXML private Label operai;
					@FXML
				    private BorderPane borderPaneAspettoEconomicoEFinanziario;
						@FXML
					    private Label aspettoEconomicoEFinanziarioLabel;
						@FXML
					    private GridPane gridPaneAspettoEconomicoEFinanziario;
							@FXML private Label totaleCostiLabel; @FXML private Label totaleCosti;
							@FXML private Label totaleRicaviLabel; @FXML private Label totaleRicavi;
							@FXML private Label vociTotaliLabel; @FXML private Label vociTotali;
							

}
