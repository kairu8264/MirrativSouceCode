package wm;

/* loaded from: classes4.dex */
public class l implements vm.h {

    /* renamed from: a  reason: collision with root package name */
    public final String f59211a;

    /* renamed from: b  reason: collision with root package name */
    public final int f59212b;

    public l(String str, int i10) {
        this.f59211a = str;
        this.f59212b = i10;
    }

    @Override // vm.h
    public int a() {
        return this.f59212b;
    }

    @Override // vm.h
    public String b() {
        if (this.f59212b == 0) {
            return "";
        }
        g();
        return this.f59211a;
    }

    @Override // vm.h
    public long c() {
        if (this.f59212b == 0) {
            return 0L;
        }
        String f10 = f();
        try {
            return Long.valueOf(f10).longValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "long"), e10);
        }
    }

    @Override // vm.h
    public double d() {
        if (this.f59212b == 0) {
            return 0.0d;
        }
        String f10 = f();
        try {
            return Double.valueOf(f10).doubleValue();
        } catch (NumberFormatException e10) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "double"), e10);
        }
    }

    @Override // vm.h
    public boolean e() throws IllegalArgumentException {
        if (this.f59212b == 0) {
            return false;
        }
        String f10 = f();
        if (j.f59202f.matcher(f10).matches()) {
            return true;
        }
        if (j.f59203g.matcher(f10).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", f10, "boolean"));
    }

    public final String f() {
        return b().trim();
    }

    public final void g() {
        if (this.f59211a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }
}
