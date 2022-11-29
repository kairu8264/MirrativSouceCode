package yg;

import android.annotation.TargetApi;
import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import android.view.View;

@TargetApi(18)
/* loaded from: classes3.dex */
public class g2 extends f2 {
    @Override // yg.e
    public boolean g(View view) {
        return super.g(view) || view.getWindowId() != null;
    }

    @Override // yg.e
    public final int h() {
        return 14;
    }

    @Override // yg.e
    public final long i() {
        return new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
