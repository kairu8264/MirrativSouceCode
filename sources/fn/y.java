package fn;

/* loaded from: classes4.dex */
public final class y {

    /* loaded from: classes4.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ com.google.protobuf.f f32110a;

        public a(com.google.protobuf.f fVar) {
            this.f32110a = fVar;
        }

        @Override // fn.y.b
        public byte a(int i10) {
            return this.f32110a.f(i10);
        }

        @Override // fn.y.b
        public int size() {
            return this.f32110a.size();
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        byte a(int i10);

        int size();
    }

    public static String a(com.google.protobuf.f fVar) {
        return b(new a(fVar));
    }

    public static String b(b bVar) {
        StringBuilder sb2 = new StringBuilder(bVar.size());
        for (int i10 = 0; i10 < bVar.size(); i10++) {
            byte a10 = bVar.a(i10);
            if (a10 == 34) {
                sb2.append("\\\"");
            } else if (a10 == 39) {
                sb2.append("\\'");
            } else if (a10 != 92) {
                switch (a10) {
                    case 7:
                        sb2.append("\\a");
                        continue;
                    case 8:
                        sb2.append("\\b");
                        continue;
                    case 9:
                        sb2.append("\\t");
                        continue;
                    case 10:
                        sb2.append("\\n");
                        continue;
                    case 11:
                        sb2.append("\\v");
                        continue;
                    case 12:
                        sb2.append("\\f");
                        continue;
                    case 13:
                        sb2.append("\\r");
                        continue;
                    default:
                        if (a10 >= 32 && a10 <= 126) {
                            sb2.append((char) a10);
                            continue;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((a10 >>> 6) & 3) + 48));
                            sb2.append((char) (((a10 >>> 3) & 7) + 48));
                            sb2.append((char) ((a10 & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    public static String c(String str) {
        return a(com.google.protobuf.f.l(str));
    }
}
