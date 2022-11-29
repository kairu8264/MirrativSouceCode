package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;

/* loaded from: classes3.dex */
public final class wf {

    /* renamed from: a  reason: collision with root package name */
    public static final int f11582a = vj.l("nam");

    /* renamed from: b  reason: collision with root package name */
    public static final int f11583b = vj.l("trk");

    /* renamed from: c  reason: collision with root package name */
    public static final int f11584c = vj.l("cmt");

    /* renamed from: d  reason: collision with root package name */
    public static final int f11585d = vj.l("day");

    /* renamed from: e  reason: collision with root package name */
    public static final int f11586e = vj.l("ART");

    /* renamed from: f  reason: collision with root package name */
    public static final int f11587f = vj.l("too");

    /* renamed from: g  reason: collision with root package name */
    public static final int f11588g = vj.l("alb");

    /* renamed from: h  reason: collision with root package name */
    public static final int f11589h = vj.l("com");

    /* renamed from: i  reason: collision with root package name */
    public static final int f11590i = vj.l("wrt");

    /* renamed from: j  reason: collision with root package name */
    public static final int f11591j = vj.l("lyr");

    /* renamed from: k  reason: collision with root package name */
    public static final int f11592k = vj.l("gen");

    /* renamed from: l  reason: collision with root package name */
    public static final int f11593l = vj.l("covr");

    /* renamed from: m  reason: collision with root package name */
    public static final int f11594m = vj.l("gnre");

    /* renamed from: n  reason: collision with root package name */
    public static final int f11595n = vj.l("grp");

    /* renamed from: o  reason: collision with root package name */
    public static final int f11596o = vj.l("disk");

    /* renamed from: p  reason: collision with root package name */
    public static final int f11597p = vj.l("trkn");

    /* renamed from: q  reason: collision with root package name */
    public static final int f11598q = vj.l("tmpo");

    /* renamed from: r  reason: collision with root package name */
    public static final int f11599r = vj.l("cpil");

    /* renamed from: s  reason: collision with root package name */
    public static final int f11600s = vj.l("aART");

    /* renamed from: t  reason: collision with root package name */
    public static final int f11601t = vj.l("sonm");

    /* renamed from: u  reason: collision with root package name */
    public static final int f11602u = vj.l("soal");

    /* renamed from: v  reason: collision with root package name */
    public static final int f11603v = vj.l("soar");

    /* renamed from: w  reason: collision with root package name */
    public static final int f11604w = vj.l("soaa");

    /* renamed from: x  reason: collision with root package name */
    public static final int f11605x = vj.l("soco");

    /* renamed from: y  reason: collision with root package name */
    public static final int f11606y = vj.l("rtng");

    /* renamed from: z  reason: collision with root package name */
    public static final int f11607z = vj.l("pgap");
    public static final int A = vj.l("sosn");
    public static final int B = vj.l("tvsh");
    public static final int C = vj.l(InternalFrame.ID);
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: all -> 0x01d4, TryCatch #0 {all -> 0x01d4, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:13:0x0035, B:14:0x003c, B:17:0x0045, B:19:0x0049, B:22:0x0053, B:24:0x0057, B:27:0x0061, B:29:0x0067, B:32:0x0071, B:34:0x0075, B:37:0x007f, B:39:0x0084, B:41:0x0090, B:48:0x00aa, B:49:0x00c1, B:50:0x00d3, B:53:0x00dc, B:55:0x00e0, B:58:0x00ea, B:60:0x00ee, B:63:0x00f8, B:65:0x00fc, B:68:0x0106, B:70:0x010a, B:73:0x0114, B:75:0x0118, B:78:0x0122, B:80:0x0126, B:83:0x0130, B:85:0x0134, B:88:0x013e, B:90:0x0142, B:93:0x014c, B:95:0x0150, B:98:0x015a, B:100:0x015e, B:103:0x0168, B:106:0x0170, B:108:0x0176, B:110:0x0189, B:111:0x0190, B:113:0x0194, B:114:0x019b, B:120:0x01a4, B:121:0x01aa, B:123:0x01b2, B:127:0x01bd, B:190:0x028d, B:192:0x0299, B:194:0x02a3, B:193:0x029e, B:133:0x01db, B:135:0x01df, B:137:0x01eb, B:138:0x01fc, B:140:0x0208, B:142:0x0212, B:141:0x020d, B:145:0x0219, B:147:0x021d, B:150:0x0223, B:152:0x0227, B:155:0x022d, B:157:0x0231, B:160:0x023b, B:162:0x023f, B:165:0x0249, B:167:0x024d, B:170:0x0257, B:172:0x025b, B:175:0x0265, B:177:0x0269, B:180:0x0273, B:182:0x0277, B:185:0x027f, B:187:0x0283, B:197:0x02aa, B:200:0x02b4), top: B:205:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c A[Catch: all -> 0x01d4, TRY_LEAVE, TryCatch #0 {all -> 0x01d4, blocks: (B:4:0x001c, B:6:0x0021, B:8:0x0027, B:10:0x002e, B:13:0x0035, B:14:0x003c, B:17:0x0045, B:19:0x0049, B:22:0x0053, B:24:0x0057, B:27:0x0061, B:29:0x0067, B:32:0x0071, B:34:0x0075, B:37:0x007f, B:39:0x0084, B:41:0x0090, B:48:0x00aa, B:49:0x00c1, B:50:0x00d3, B:53:0x00dc, B:55:0x00e0, B:58:0x00ea, B:60:0x00ee, B:63:0x00f8, B:65:0x00fc, B:68:0x0106, B:70:0x010a, B:73:0x0114, B:75:0x0118, B:78:0x0122, B:80:0x0126, B:83:0x0130, B:85:0x0134, B:88:0x013e, B:90:0x0142, B:93:0x014c, B:95:0x0150, B:98:0x015a, B:100:0x015e, B:103:0x0168, B:106:0x0170, B:108:0x0176, B:110:0x0189, B:111:0x0190, B:113:0x0194, B:114:0x019b, B:120:0x01a4, B:121:0x01aa, B:123:0x01b2, B:127:0x01bd, B:190:0x028d, B:192:0x0299, B:194:0x02a3, B:193:0x029e, B:133:0x01db, B:135:0x01df, B:137:0x01eb, B:138:0x01fc, B:140:0x0208, B:142:0x0212, B:141:0x020d, B:145:0x0219, B:147:0x021d, B:150:0x0223, B:152:0x0227, B:155:0x022d, B:157:0x0231, B:160:0x023b, B:162:0x023f, B:165:0x0249, B:167:0x024d, B:170:0x0257, B:172:0x025b, B:175:0x0265, B:177:0x0269, B:180:0x0273, B:182:0x0277, B:185:0x027f, B:187:0x0283, B:197:0x02aa, B:200:0x02b4), top: B:205:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static ai.qg a(ai.nj r13) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.wf.a(ai.nj):ai.qg");
    }

    public static zg b(int i10, String str, nj njVar) {
        int r10 = njVar.r();
        if (njVar.r() == jf.F0) {
            njVar.j(8);
            return new zg(str, null, njVar.w(r10 - 16));
        }
        String c10 = jf.c(i10);
        Log.w("MetadataUtil", c10.length() != 0 ? "Failed to parse text attribute: ".concat(c10) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static xg c(int i10, String str, nj njVar, boolean z10, boolean z11) {
        int e10 = e(njVar);
        if (z11) {
            e10 = Math.min(1, e10);
        }
        if (e10 >= 0) {
            if (z10) {
                return new zg(str, null, Integer.toString(e10));
            }
            return new vg(C.LANGUAGE_UNDETERMINED, str, Integer.toString(e10));
        }
        String c10 = jf.c(i10);
        Log.w("MetadataUtil", c10.length() != 0 ? "Failed to parse uint8 attribute: ".concat(c10) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static zg d(int i10, String str, nj njVar) {
        int r10 = njVar.r();
        if (njVar.r() == jf.F0 && r10 >= 22) {
            njVar.j(10);
            int m10 = njVar.m();
            if (m10 > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(m10);
                String sb3 = sb2.toString();
                int m11 = njVar.m();
                if (m11 > 0) {
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 12);
                    sb4.append(sb3);
                    sb4.append("/");
                    sb4.append(m11);
                    sb3 = sb4.toString();
                }
                return new zg(str, null, sb3);
            }
        }
        String c10 = jf.c(i10);
        Log.w("MetadataUtil", c10.length() != 0 ? "Failed to parse index/count attribute: ".concat(c10) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static int e(nj njVar) {
        njVar.j(4);
        if (njVar.r() == jf.F0) {
            njVar.j(8);
            return njVar.l();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
