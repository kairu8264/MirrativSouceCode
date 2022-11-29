package vb;

import android.os.Parcelable;
import com.dena.mirrorman.clientlog.logs.MRLog;
import java.io.Serializable;

/* loaded from: classes2.dex */
public interface p {

    /* loaded from: classes2.dex */
    public static final class a {
        public static void a(p pVar, Serializable serializable, boolean z10) {
            jo.p.h(serializable, MRLog.TARGET_TYPE_BANNER);
        }

        public static void b(p pVar, Serializable serializable) {
            jo.p.h(serializable, MRLog.TARGET_TYPE_BANNER);
        }
    }

    void G2(String str);

    void J0();

    void V1(Serializable serializable);

    void W0(float f10);

    void b2();

    void h();

    void i();

    void i1();

    void j2(String str);

    void k1(Serializable serializable, boolean z10);

    void r1(boolean z10);

    void t1();

    void y2(Parcelable parcelable, boolean z10);
}
