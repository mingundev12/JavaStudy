package exam22;

public class _Exec {

	public static void main(String[] args) {
		Downloader downloader = new Downloader();
		
		downloader.startDownload(new Downloader.DownloadListener() {
			@Override
			public void onComplete(String result) {
				System.out.println("결과를 받았습니다: " + result);
			}
		});
		
		
	}

}
