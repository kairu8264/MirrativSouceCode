package ai;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzath;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class gh {

    /* renamed from: a  reason: collision with root package name */
    public final me[] f4435a;

    /* renamed from: b  reason: collision with root package name */
    public final ne f4436b;

    /* renamed from: c  reason: collision with root package name */
    public me f4437c;

    public gh(me[] meVarArr, ne neVar) {
        this.f4435a = meVarArr;
        this.f4436b = neVar;
    }

    public final void a() {
        if (this.f4437c != null) {
            this.f4437c = null;
        }
    }

    public final me b(le leVar, Uri uri) throws IOException, InterruptedException {
        me meVar = this.f4437c;
        if (meVar != null) {
            return meVar;
        }
        me[] meVarArr = this.f4435a;
        int length = meVarArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            me meVar2 = meVarArr[i10];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th2) {
                leVar.g();
                throw th2;
            }
            if (meVar2.h(leVar)) {
                this.f4437c = meVar2;
                leVar.g();
                break;
            }
            continue;
            leVar.g();
            i10++;
        }
        me meVar3 = this.f4437c;
        if (meVar3 != null) {
            meVar3.i(this.f4436b);
            return this.f4437c;
        }
        String n10 = vj.n(this.f4435a);
        StringBuilder sb2 = new StringBuilder(n10.length() + 58);
        sb2.append("None of the available extractors (");
        sb2.append(n10);
        sb2.append(") could read the stream.");
        throw new zzath(sb2.toString(), uri);
    }
}
