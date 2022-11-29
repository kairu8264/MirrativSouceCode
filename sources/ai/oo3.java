package ai;

import android.content.Context;
import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class oo3 implements mp3 {

    /* renamed from: a  reason: collision with root package name */
    public final z6 f7871a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<mp3> f7872b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f7873c;

    public oo3(Context context, sv3 sv3Var) {
        ms3 ms3Var = new ms3(context);
        this.f7871a = ms3Var;
        SparseArray<mp3> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (mp3) Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(mp3.class).getConstructor(z6.class).newInstance(ms3Var));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (mp3) Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(mp3.class).getConstructor(z6.class).newInstance(ms3Var));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (mp3) Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(mp3.class).getConstructor(z6.class).newInstance(ms3Var));
        } catch (Exception unused3) {
        }
        try {
            sparseArray.put(3, (mp3) Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(mp3.class).getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (Exception unused4) {
        }
        sparseArray.put(4, new fq3(ms3Var, sv3Var));
        this.f7872b = sparseArray;
        this.f7873c = new int[sparseArray.size()];
        for (int i10 = 0; i10 < this.f7872b.size(); i10++) {
            this.f7873c[i10] = this.f7872b.keyAt(i10);
        }
    }
}
