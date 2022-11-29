package com.google.protobuf;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public static final Charset f28215a = Charset.forName(C.UTF8_NAME);

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f28216b = Charset.forName(C.ISO88591_NAME);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f28217c;

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f28218d;

    /* renamed from: e  reason: collision with root package name */
    public static final com.google.protobuf.g f28219e;

    /* loaded from: classes4.dex */
    public interface a extends i<Boolean> {
    }

    /* loaded from: classes4.dex */
    public interface b extends i<Double> {
    }

    /* loaded from: classes4.dex */
    public interface c {
        int getNumber();
    }

    /* loaded from: classes4.dex */
    public interface d<T extends c> {
        T a(int i10);
    }

    /* loaded from: classes4.dex */
    public interface e {
        boolean a(int i10);
    }

    /* loaded from: classes4.dex */
    public interface f extends i<Float> {
    }

    /* loaded from: classes4.dex */
    public interface g extends i<Integer> {
        void Y0(int i10);

        int getInt(int i10);

        @Override // com.google.protobuf.t.i
        i<Integer> o(int i10);
    }

    /* loaded from: classes4.dex */
    public interface h extends i<Long> {
    }

    /* loaded from: classes4.dex */
    public interface i<E> extends List<E>, RandomAccess {
        void C();

        boolean L0();

        i<E> o(int i10);
    }

    static {
        byte[] bArr = new byte[0];
        f28217c = bArr;
        f28218d = ByteBuffer.wrap(bArr);
        f28219e = com.google.protobuf.g.f(bArr);
    }

    public static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    public static <T> T b(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i10, int i11) {
        int i12 = i(i11, bArr, i10, i11);
        if (i12 == 0) {
            return 1;
        }
        return i12;
    }

    public static int f(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return o0.m(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((d0) obj).c().k0((d0) obj2).r0();
    }

    public static int i(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f28215a);
    }
}
