package ai;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.util.MimeTypes;
import com.mirrativ.llstream.encoder.AACEncoder;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class yc {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f12527a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f12528b = {OpusUtil.SAMPLE_RATE, AACEncoder.SAMPLING_RATE, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12529c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f12530d = 0;

    public static oc a(nj njVar, String str, String str2, ie ieVar) {
        int i10 = f12528b[(njVar.l() & PsExtractor.AUDIO_STREAM) >> 6];
        int l10 = njVar.l();
        int i11 = f12529c[(l10 & 56) >> 3];
        if ((l10 & 4) != 0) {
            i11++;
        }
        return oc.b(str, MimeTypes.AUDIO_AC3, null, -1, -1, i11, i10, null, ieVar, 0, str2);
    }

    public static oc b(nj njVar, String str, String str2, ie ieVar) {
        njVar.j(2);
        int i10 = f12528b[(njVar.l() & PsExtractor.AUDIO_STREAM) >> 6];
        int l10 = njVar.l();
        int i11 = f12529c[(l10 & 14) >> 1];
        if ((l10 & 1) != 0) {
            i11++;
        }
        return oc.b(str, MimeTypes.AUDIO_E_AC3, null, -1, -1, i11, i10, null, ieVar, 0, str2);
    }

    public static int c(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? f12527a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }
}
