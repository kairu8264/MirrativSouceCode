package ai;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzkc;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class yr3 extends z4 {

    /* renamed from: e  reason: collision with root package name */
    public final AssetManager f12713e;

    /* renamed from: f  reason: collision with root package name */
    public Uri f12714f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f12715g;

    /* renamed from: h  reason: collision with root package name */
    public long f12716h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f12717i;

    public yr3(Context context) {
        super(false);
        this.f12713e = context.getAssets();
    }

    @Override // ai.a6
    public final int b(byte[] bArr, int i10, int i11) throws zzkc {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f12716h;
        if (j10 != 0) {
            if (j10 != -1) {
                try {
                    i11 = (int) Math.min(j10, i11);
                } catch (IOException e10) {
                    throw new zzkc(e10, 2000);
                }
            }
            InputStream inputStream = this.f12715g;
            int i12 = sb.f9778a;
            int read = inputStream.read(bArr, i10, i11);
            if (read == -1) {
                return -1;
            }
            long j11 = this.f12716h;
            if (j11 != -1) {
                this.f12716h = j11 - read;
            }
            s(read);
            return read;
        }
        return -1;
    }

    @Override // ai.a8
    public final void g() throws zzkc {
        this.f12714f = null;
        try {
            try {
                InputStream inputStream = this.f12715g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f12715g = null;
                if (this.f12717i) {
                    this.f12717i = false;
                    t();
                }
            } catch (IOException e10) {
                throw new zzkc(e10, 2000);
            }
        } catch (Throwable th2) {
            this.f12715g = null;
            if (this.f12717i) {
                this.f12717i = false;
                t();
            }
            throw th2;
        }
    }

    @Override // ai.a8
    public final Uri h() {
        return this.f12714f;
    }

    @Override // ai.a8
    public final long m(bc bcVar) throws zzkc {
        try {
            Uri uri = bcVar.f2279a;
            this.f12714f = uri;
            String path = uri.getPath();
            Objects.requireNonNull(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            q(bcVar);
            InputStream open = this.f12713e.open(path, 1);
            this.f12715g = open;
            if (open.skip(bcVar.f2284f) >= bcVar.f2284f) {
                long j10 = bcVar.f2285g;
                if (j10 != -1) {
                    this.f12716h = j10;
                } else {
                    long available = this.f12715g.available();
                    this.f12716h = available;
                    if (available == 2147483647L) {
                        this.f12716h = -1L;
                    }
                }
                this.f12717i = true;
                r(bcVar);
                return this.f12716h;
            }
            throw new zzkc(null, 2008);
        } catch (zzkc e10) {
            throw e10;
        } catch (IOException e11) {
            throw new zzkc(e11, true != (e11 instanceof FileNotFoundException) ? 2000 : 2005);
        }
    }
}
