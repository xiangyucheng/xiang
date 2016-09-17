package cn.tedu.mediaplayer_v4.model;

import java.util.List;

import cn.tedu.mediaplayer_v4.entity.SongInfo;
import cn.tedu.mediaplayer_v4.entity.SongUrl;

/**
 * 通过songid访问音乐基本信息成功后的回调
 */
public interface SongInfoCallback {
	/**
	 * 在MusicModel中当音乐信息加载完毕后，
	 * 在主线程中调用该回调方法。 
	 * @param urls
	 * @param info
	 */
	void onSongInfoLoaded(List<SongUrl> urls, SongInfo info);
}



