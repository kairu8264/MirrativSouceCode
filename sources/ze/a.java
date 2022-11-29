package ze;

import android.util.Size;
import java.util.List;
import java.util.ListIterator;
import xn.a0;

/* loaded from: classes2.dex */
public enum a {
    RATIO9x21 { // from class: ze.a.i
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), Float.POSITIVE_INFINITY);
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(9.0f, 21.0f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "336x784";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "408x952";
                }
            } else if (str.equals("low")) {
                str2 = "216x504";
            }
            return a.Companion.a(str2);
        }
    },
    RATIO9x19p5 { // from class: ze.a.h
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), a.RATIO9x21.e());
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(9.0f, 19.5f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "336x728";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "432x936";
                }
            } else if (str.equals("low")) {
                str2 = "240x520";
            }
            return a.Companion.a(str2);
        }
    },
    RATIO9x19 { // from class: ze.a.g
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), a.RATIO9x19p5.e());
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(9.0f, 19.0f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "360x760";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "432x912";
                }
            } else if (str.equals("low")) {
                str2 = "216x456";
            }
            return a.Companion.a(str2);
        }
    },
    RATIO9x18p5 { // from class: ze.a.f
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), a.RATIO9x19.e());
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(9.0f, 18.5f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "360x740";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "432x888";
                }
            } else if (str.equals("low")) {
                str2 = "216x444";
            }
            return a.Companion.a(str2);
        }
    },
    RATIO9x18 { // from class: ze.a.e
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), a.RATIO9x18p5.e());
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(9.0f, 18.0f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "360x720";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "432x864";
                }
            } else if (str.equals("low")) {
                str2 = "240x480";
            }
            return a.Companion.a(str2);
        }
    },
    RATIO9x16 { // from class: ze.a.d
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), a.RATIO9x18.e());
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(9.0f, 16.0f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "360x640";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "480x854";
                }
            } else if (str.equals("low")) {
                str2 = "240x426";
            }
            return a.Companion.a(str2);
        }
    },
    RATIO10x16 { // from class: ze.a.b
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), a.RATIO9x16.e());
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(10.0f, 16.0f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "360x576";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "480x768";
                }
            } else if (str.equals("low")) {
                str2 = "240x384";
            }
            return a.Companion.a(str2);
        }
    },
    RATIO3x4 { // from class: ze.a.c
        @Override // ze.a
        public po.e<Float> c() {
            return po.m.b(e(), a.RATIO9x16.e());
        }

        @Override // ze.a
        public float e() {
            return a.Companion.b(3.0f, 4.0f);
        }

        @Override // ze.a
        public Size h(String str) {
            jo.p.h(str, "quality");
            int hashCode = str.hashCode();
            String str2 = "432x576";
            if (hashCode == -1039745817) {
                str.equals("normal");
            } else if (hashCode != 107348) {
                if (hashCode == 3202466 && str.equals("high")) {
                    str2 = "528x704";
                }
            } else if (str.equals("low")) {
                str2 = "240x320";
            }
            return a.Companion.a(str2);
        }
    };
    
    public static final C1095a Companion = new C1095a(null);

    /* renamed from: ze.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1095a {
        public C1095a() {
        }

        public /* synthetic */ C1095a(jo.h hVar) {
            this();
        }

        public final Size a(String str) {
            List k10;
            boolean z10;
            jo.p.h(str, "resolution");
            List r02 = so.o.r0(str, new String[]{"x"}, false, 0, 6, null);
            if (!r02.isEmpty()) {
                ListIterator listIterator = r02.listIterator(r02.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() == 0) {
                        z10 = true;
                        continue;
                    } else {
                        z10 = false;
                        continue;
                    }
                    if (!z10) {
                        k10 = a0.w0(r02, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            k10 = xn.s.k();
            Object[] array = k10.toArray(new String[0]);
            jo.p.f(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            return new Size(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
        }

        public final float b(float f10, float f11) {
            float f12;
            if (f10 == 0.0f) {
                return 1.0f;
            }
            if ((f11 == 0.0f) || Float.isNaN(f10) || Float.isNaN(f11) || Float.isInfinite(f10) || Float.isInfinite(f11)) {
                return 1.0f;
            }
            float max = Math.max(f11, f10) / Math.min(f11, f10);
            return ((float) Math.floor(max * f12)) / 100;
        }
    }

    /* synthetic */ a(jo.h hVar) {
        this();
    }

    public abstract po.e<Float> c();

    public abstract float e();

    public abstract Size h(String str);
}
