package cn.tedu.mediaplayer_v4.model;

import java.util.List;

import cn.tedu.mediaplayer_v4.entity.SongInfo;
import cn.tedu.mediaplayer_v4.entity.SongUrl;

/**
 * ͨ��songid�������ֻ�����Ϣ�ɹ���Ļص�
 */
public interface SongInfoCallback {
	/**
	 * ��MusicModel�е�������Ϣ������Ϻ�
	 * �����߳��е��øûص������� 
	 * @param urls
	 * @param info
	 */
	void onSongInfoLoaded(List<SongUrl> urls, SongInfo info);
}



