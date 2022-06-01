package question2;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
  public void	searchOutdatedModel(String name){
		for(String x:outdatedModels) {
			if(x.equals(name)) {
				System.out.println(x+"_OUTDATED");
			}else {
				System.out.println(name+" mobile is latest");
				break;
			}
		}
	}
}
