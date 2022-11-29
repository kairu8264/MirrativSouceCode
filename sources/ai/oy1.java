package ai;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.google.android.gms.internal.ads.zzds;

/* loaded from: classes3.dex */
public final class oy1 {

    /* renamed from: a  reason: collision with root package name */
    public final v4 f8158a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8159b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8160c = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f8161d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8162e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8163f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8164g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8165h;

    /* renamed from: i  reason: collision with root package name */
    public final u71[] f8166i;

    public oy1(v4 v4Var, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10, u71[] u71VarArr) {
        this.f8158a = v4Var;
        this.f8159b = i10;
        this.f8161d = i12;
        this.f8162e = i13;
        this.f8163f = i14;
        this.f8164g = i15;
        this.f8166i = u71VarArr;
        int minBufferSize = AudioTrack.getMinBufferSize(i13, i14, i15);
        u9.d(minBufferSize != -2);
        this.f8165h = sb.c0(minBufferSize * 4, ((int) b(250000L)) * i12, Math.max(minBufferSize, ((int) b(750000L)) * i12));
    }

    public final long a(long j10) {
        return (j10 * 1000000) / this.f8162e;
    }

    public final long b(long j10) {
        return (j10 * this.f8162e) / 1000000;
    }

    public final AudioTrack c(boolean z10, lc3 lc3Var, int i10) throws zzds {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            int i11 = sb.f9778a;
            if (i11 >= 29) {
                int i12 = this.f8162e;
                build2 = new AudioFormat.Builder().setSampleRate(i12).setChannelMask(this.f8163f).setEncoding(this.f8164g).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(lc3Var.a()).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.f8165h).setSessionId(i10).setOffloadedPlayback(false).build();
            } else if (i11 >= 21) {
                AudioAttributes a10 = lc3Var.a();
                int i13 = this.f8162e;
                build = new AudioFormat.Builder().setSampleRate(i13).setChannelMask(this.f8163f).setEncoding(this.f8164g).build();
                audioTrack = new AudioTrack(a10, build, this.f8165h, 1, i10);
            } else {
                int i14 = lc3Var.f6519a;
                if (i10 == 0) {
                    audioTrack = new AudioTrack(3, this.f8162e, this.f8163f, this.f8164g, this.f8165h, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.f8162e, this.f8163f, this.f8164g, this.f8165h, 1, i10);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzds(state, this.f8162e, this.f8163f, this.f8165h, this.f8158a, false, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new zzds(0, this.f8162e, this.f8163f, this.f8165h, this.f8158a, false, e10);
        }
    }
}
