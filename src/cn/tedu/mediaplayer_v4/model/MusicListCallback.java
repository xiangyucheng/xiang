package cn.tedu.mediaplayer_v4.model;

import java.util.List;

import cn.tedu.mediaplayer_v4.entity.Music;

/**
 * �����б�Ļص��ӿ�
 *  �����ּ�����Ϻ�ִ�иûص�����
 */
public interface MusicListCallback {
	/**
	 * �����ּ�����Ϻ�ִ�иûص�����
	 */
	public void onMusicListLoaded(List<Music> musics);

}
