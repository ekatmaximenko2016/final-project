package imported;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.apache.uima.analysis_component.JCasAnnotator_ImplBase;
import org.apache.uima.jcas.JCas;
//import org.apache.uima.tutorial.RoomNumber;

import imported.model.CommandAnnotation;

//import ru.bmstu.iu3.CommandRecognizer;

public class CommandAnnotator extends JCasAnnotator_ImplBase {

//extends CasAnnotator_ImplBase {

	@Override
	public void process(JCas aJCas) { //throws AnalysisEngineProcessException {

		try {
			readCommand();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}

		//CAS myView = aCas.getView("OriginalDocument");
		//Type annot = myView.getAnnotationType();
		//Type cross = myView.getTypeSystem().getType("ru.bmstu.iu3.CommandAnnotation");
		//Feature other = cross.getFeatureByBaseName("otherAnnotation");

		//String orgText = myView.getDocumentText();

		String orgText = aJCas.getDocumentText();
		int orgEnd = 0;
		int commandBegin = 0;
		int commandEnd = 0;

		try {
			//JCas aJCas = myView.getJCas();

			StringTokenizer st = new StringTokenizer(orgText);

			while (st.hasMoreTokens()) {

				String thisTok = st.nextToken();

				CommandAnnotation annotation = new CommandAnnotation(aJCas);

				if (checker(thisTok)) {

					int orgBegin = orgText.indexOf(thisTok, orgEnd);
					orgEnd = orgBegin + thisTok.length();

					System.out.println("original BEGIN:" + orgBegin + " original END:" + orgEnd);

					annotation.setBegin(orgBegin);
					annotation.setEnd(orgEnd);
					annotation.addToIndexes();
				}
			}
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	static ArrayList<String> commands;

	private void readCommand() throws FileNotFoundException, IOException {
		Scanner s = new Scanner(new File("uima/commands/commands.txt"));
		commands = new ArrayList<String>();
		while (s.hasNext()) {
			commands.add(s.next());
		}
		s.close();
	}

	private boolean checker(String word) {
		for (String command : commands) {
			if (word.equals(command))
				return true;
		}
		return false;
	}

}
