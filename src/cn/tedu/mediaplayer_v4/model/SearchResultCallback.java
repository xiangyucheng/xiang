package cn.tedu.mediaplayer_v4.model;

import java.util.List;

import cn.tedu.mediaplayer_v4.entity.Music;

/**
 * ����ȡ�����������ִ�иûص�����
 */
public interface SearchResultCallback {
	
	public void onResultLoaded(List<Music> musics);
}

