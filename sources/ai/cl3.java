package ai;

/* loaded from: classes3.dex */
public final class cl3 {
    public static String a(oh3 oh3Var) {
        StringBuilder sb2 = new StringBuilder(oh3Var.p());
        for (int i10 = 0; i10 < oh3Var.p(); i10++) {
            byte l10 = oh3Var.l(i10);
            if (l10 == 34) {
                sb2.append("\\\"");
            } else if (l10 == 39) {
                sb2.append("\\'");
            } else if (l10 != 92) {
                switch (l10) {
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
                        if (l10 >= 32 && l10 <= 126) {
                            sb2.append((char) l10);
                            continue;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((l10 >>> 6) & 3) + 48));
                            sb2.append((char) (((l10 >>> 3) & 7) + 48));
                            sb2.append((char) ((l10 & 7) + 48));
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
}
