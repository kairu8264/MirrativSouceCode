package nh;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import rh.u1;
import rh.v1;

/* loaded from: classes3.dex */
public abstract class s extends u1 {

    /* renamed from: w  reason: collision with root package name */
    public final int f43562w;

    public s(byte[] bArr) {
        rh.p.a(bArr.length == 25);
        this.f43562w = Arrays.hashCode(bArr);
    }

    public static byte[] z0(String str) {
        try {
            return str.getBytes(C.ISO88591_NAME);
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // rh.v1
    public final int b() {
        return this.f43562w;
    }

    @Override // rh.v1
    public final yh.a d() {
        return yh.b.h1(h1());
    }

    public final boolean equals(Object obj) {
        yh.a d10;
        if (obj != null && (obj instanceof v1)) {
            try {
                v1 v1Var = (v1) obj;
                if (v1Var.b() == this.f43562w && (d10 = v1Var.d()) != null) {
                    return Arrays.equals(h1(), (byte[]) yh.b.z0(d10));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public abstract byte[] h1();

    public final int hashCode() {
        return this.f43562w;
    }
}
