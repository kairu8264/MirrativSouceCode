package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes3.dex */
final class MotionPhotoDescription {
    public final List<ContainerItem> items;
    public final long photoPresentationTimestampUs;

    /* loaded from: classes3.dex */
    public static final class ContainerItem {
        public final long length;
        public final String mime;
        public final long padding;
        public final String semantic;

        public ContainerItem(String str, String str2, long j10, long j11) {
            this.mime = str;
            this.semantic = str2;
            this.length = j10;
            this.padding = j11;
        }
    }

    public MotionPhotoDescription(long j10, List<ContainerItem> list) {
        this.photoPresentationTimestampUs = j10;
        this.items = list;
    }

    public MotionPhotoMetadata getMotionPhotoMetadata(long j10) {
        long j11;
        if (this.items.size() < 2) {
            return null;
        }
        long j12 = j10;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long j16 = -1;
        boolean z10 = false;
        for (int size = this.items.size() - 1; size >= 0; size--) {
            ContainerItem containerItem = this.items.get(size);
            boolean equals = MimeTypes.VIDEO_MP4.equals(containerItem.mime) | z10;
            if (size == 0) {
                j11 = j12 - containerItem.padding;
                j12 = 0;
            } else {
                long j17 = j12;
                j12 -= containerItem.length;
                j11 = j17;
            }
            if (!equals || j12 == j11) {
                z10 = equals;
            } else {
                j16 = j11 - j12;
                j15 = j12;
                z10 = false;
            }
            if (size == 0) {
                j13 = j12;
                j14 = j11;
            }
        }
        if (j15 == -1 || j16 == -1 || j13 == -1 || j14 == -1) {
            return null;
        }
        return new MotionPhotoMetadata(j13, j14, this.photoPresentationTimestampUs, j15, j16);
    }
}
