package ak;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    public final dk.b0<u4> f13718a;

    public y0(dk.b0<u4> b0Var) {
        this.f13718a = b0Var;
    }

    public final InputStream a(int i10, String str, String str2, int i11) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) jk.f.a(this.f13718a.zza().c(i10, str, str2, i11));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new p1(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), i10);
        } catch (InterruptedException e10) {
            throw new p1("Extractor was interrupted while waiting for chunk file.", e10, i10);
        } catch (ExecutionException e11) {
            throw new p1(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i10), str, str2, Integer.valueOf(i11)), e11, i10);
        }
    }
}
