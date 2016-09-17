package cn.tedu.mediaplayer_v4.model;

import java.util.List;

import cn.tedu.mediaplayer_v4.entity.Music;

/**
 * 音乐列表的回调接口
 *  当音乐加载完毕后执行该回调方法
 */
public interface MusicListCallback {
	/**
	 * 当音乐加载完毕后执行该回调方法
	 */
	public void onMusicListLoaded(List<Music> musics);

}
