package com.example.smoothimagedemo;

import java.util.Random;

public class BitmapSampleUtil {

	public static String[] IMAGES = new String[] { "http://img4.imgtn.bdimg.com/it/u=2377215482,757805324&fm=21&gp=0.jpg",
			"http://img1.imgtn.bdimg.com/it/u=2955244448,132069077&fm=21&gp=0.jpg", "http://img2.imgtn.bdimg.com/it/u=3091631697,3871574487&fm=21&gp=0.jpg",
			"http://img2.imgtn.bdimg.com/it/u=578220563,2860818021&fm=21&gp=0.jpg",
			"http://img3.imgtn.bdimg.com/it/u=3746940734,426214123&fm=21&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=214133675,4081367284&fm=21&gp=0.jpg",
			"http://img5.imgtn.bdimg.com/it/u=99783921,1028179412&fm=21&gp=0.jpg", "http://img2.imgtn.bdimg.com/it/u=326109832,4175833208&fm=21&gp=0.jpg",
			"http://img1.imgtn.bdimg.com/it/u=3421919610,1718615495&fm=21&gp=0.jpg","http://img0.imgtn.bdimg.com/it/u=620452195,2622903875&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=3507039149,1416641451&fm=21&gp=0.jpg",
            "http://img4.imgtn.bdimg.com/it/u=188502753,1368646183&fm=21&gp=0.jpg",
            "http://img0.imgtn.bdimg.com/it/u=3303756843,78109311&fm=21&gp=0.jpg", };

	/**
	 * 随机产生的一个图片Url
	 * 
	 * @return
	 */
	public static String getBmpUrl() {
		int index = new Random().nextInt(IMAGES.length);
		return IMAGES[index];
	}
}
