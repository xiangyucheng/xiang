package cn.tedu.mediaplayer_v4.model;

import java.util.List;

import cn.tedu.mediaplayer_v4.entity.Music;

/**
 * 当获取到搜索结果后执行该回调方法
 */
public interface SearchResultCallback {
	
	public void onResultLoaded(List<Music> musics);
}

