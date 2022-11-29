package jf;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class q0 implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public final int f37972w;

    /* renamed from: x  reason: collision with root package name */
    public final String f37973x;

    /* renamed from: y  reason: collision with root package name */
    public final int f37974y;

    /* renamed from: z  reason: collision with root package name */
    public final int f37975z;

    public q0(int i10, String str, int i11, int i12) {
        jo.p.h(str, "character");
        this.f37972w = i10;
        this.f37973x = str;
        this.f37974y = i11;
        this.f37975z = i12;
    }

    public final String a() {
        return this.f37973x;
    }

    public final int b() {
        return this.f37974y;
    }

    public final int c() {
        return this.f37975z;
    }

    public final int d() {
        return this.f37972w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            return this.f37972w == q0Var.f37972w && jo.p.c(this.f37973x, q0Var.f37973x) && this.f37974y == q0Var.f37974y && this.f37975z == q0Var.f37975z;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f37972w) * 31) + this.f37973x.hashCode()) * 31) + Integer.hashCode(this.f37974y)) * 31) + Integer.hashCode(this.f37975z);
    }

    public String toString() {
        return "RubyInfo(positionX=" + this.f37972w + ", character=" + this.f37973x + ", length=" + this.f37974y + ", mergeNum=" + this.f37975z + ')';
    }

    public /* synthetic */ q0(int i10, String str, int i11, int i12, int i13, jo.h hVar) {
        this(i10, str, i11, (i13 & 8) != 0 ? 0 : i12);
    }
}
