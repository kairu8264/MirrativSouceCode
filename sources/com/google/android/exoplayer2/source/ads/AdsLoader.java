package com.google.android.exoplayer2.source.ads;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdsMediaSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import lk.r;

/* loaded from: classes3.dex */
public interface AdsLoader {

    /* loaded from: classes3.dex */
    public interface AdViewProvider {
        default List<OverlayInfo> getAdOverlayInfos() {
            r.a aVar = new r.a();
            for (View view : getAdOverlayViews()) {
                aVar.d(new OverlayInfo(view, 0));
            }
            return aVar.e();
        }

        @Deprecated
        default View[] getAdOverlayViews() {
            return new View[0];
        }

        ViewGroup getAdViewGroup();
    }

    /* loaded from: classes3.dex */
    public interface EventListener {
        default void onAdClicked() {
        }

        default void onAdLoadError(AdsMediaSource.AdLoadException adLoadException, DataSpec dataSpec) {
        }

        default void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        }

        default void onAdTapped() {
        }
    }

    /* loaded from: classes3.dex */
    public static final class OverlayInfo {
        public static final int PURPOSE_CLOSE_AD = 1;
        public static final int PURPOSE_CONTROLS = 0;
        public static final int PURPOSE_NOT_VISIBLE = 3;
        public static final int PURPOSE_OTHER = 2;
        public final int purpose;
        public final String reasonDetail;
        public final View view;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Purpose {
        }

        public OverlayInfo(View view, int i10) {
            this(view, i10, null);
        }

        public OverlayInfo(View view, int i10, String str) {
            this.view = view;
            this.purpose = i10;
            this.reasonDetail = str;
        }
    }

    void handlePrepareComplete(AdsMediaSource adsMediaSource, int i10, int i11);

    void handlePrepareError(AdsMediaSource adsMediaSource, int i10, int i11, IOException iOException);

    void release();

    void setPlayer(Player player);

    void setSupportedContentTypes(int... iArr);

    void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, EventListener eventListener);

    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);
}
