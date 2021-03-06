package org.iflab.wecentermobileandroidrestructure.model;

import java.io.Serializable;

/**
 * Created by hcjcch on 15/5/22.
 */
public class ImageInfo implements Serializable {
    public String path;
    public long photoId;
    public int width;
    public int height;
    private static final String prefix = "file://";

    public ImageInfo(String path) {
        this.path = pathAddPreFix(path);
    }

    public static String pathAddPreFix(String path) {
        if (!path.startsWith(prefix)) {
            path = prefix + path;
        }
        return path;
    }

    public static boolean isLocalFile(String path) {
        return path.startsWith(prefix);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImageInfo imageInfo = (ImageInfo) o;

        if (photoId != imageInfo.photoId) return false;
        if (width != imageInfo.width) return false;
        if (height != imageInfo.height) return false;
        return !(path != null ? !path.equals(imageInfo.path) : imageInfo.path != null);

    }

    @Override
    public int hashCode() {
        int result = path != null ? path.hashCode() : 0;
        result = 31 * result + (int) (photoId ^ (photoId >>> 32));
        result = 31 * result + width;
        result = 31 * result + height;
        return result;
    }

    @Override
    public String toString() {
        return "ImageInfo{" +
                "path='" + path + '\'' +
                ", photoId=" + photoId +
                ", width=" + width +
                ", height=" + height +
                '}';
    }

}