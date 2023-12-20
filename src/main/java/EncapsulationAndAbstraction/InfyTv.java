package EncapsulationAndAbstraction;

public class InfyTv 
{
	private String photographer, newsReporter, correspondent;

	public String getPhotographer() {
		return photographer;
	}

	public void setPhotographer(String photographer) {
		this.photographer = photographer;
	}

	public String getNewsReporter() {
		return newsReporter;
	}

	public void setNewsReporter(String newsReporter) {
		this.newsReporter = newsReporter;
	}

	public String getCorrespondent() {
		return correspondent;
	}

	public void setCorrespondent(String correspondent) {
		this.correspondent = correspondent;
	}
	
	public void documentaryFilm()
	{
		System.out.println("A hundred years ago 10K tigers were present now 1K ");
		System.out.println("By Correspondent : " + this.getCorrespondent());
		System.out.println("Photographer : " + this.getPhotographer());
		System.out.println("Reporter : " + this.getNewsReporter());
	}
}
