package exam22;

public class Downloader {
	interface DownloadListener {
		void onComplete(String result);
	}
	
	void startDownload(DownloadListener listener) {
		System.out.println("다운로드를 시작합니다.");
		try { Thread.sleep(2000); } catch (Exception e) {}
		listener.onComplete("성공한 데이터");
	}
}
