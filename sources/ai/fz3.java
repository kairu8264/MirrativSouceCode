package ai;

import android.util.Log;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class fz3 {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f4263a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4264b = 0;

    public static u7 a(hb hbVar) {
        String str;
        int o10 = hbVar.o() + hbVar.D();
        int D = hbVar.D();
        int i10 = (D >> 24) & 255;
        u7 u7Var = null;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = D & 16777215;
                if (i11 == 6516084) {
                    int D2 = hbVar.D();
                    if (hbVar.D() == 1684108385) {
                        hbVar.s(8);
                        String f10 = hbVar.f(D2 - 16);
                        u7Var = new r8(C.LANGUAGE_UNDETERMINED, f10, f10);
                    } else {
                        String b10 = qy3.b(D);
                        Log.w("MetadataUtil", b10.length() != 0 ? "Failed to parse comment attribute: ".concat(b10) : new String("Failed to parse comment attribute: "));
                    }
                    return u7Var;
                } else if (i11 == 7233901 || i11 == 7631467) {
                    return b(D, "TIT2", hbVar);
                } else {
                    if (i11 == 6516589 || i11 == 7828084) {
                        return b(D, "TCOM", hbVar);
                    }
                    if (i11 == 6578553) {
                        return b(D, "TDRC", hbVar);
                    }
                    if (i11 == 4280916) {
                        return b(D, "TPE1", hbVar);
                    }
                    if (i11 == 7630703) {
                        return b(D, "TSSE", hbVar);
                    }
                    if (i11 == 6384738) {
                        return b(D, "TALB", hbVar);
                    }
                    if (i11 == 7108978) {
                        return b(D, "USLT", hbVar);
                    }
                    if (i11 == 6776174) {
                        return b(D, "TCON", hbVar);
                    }
                    if (i11 == 6779504) {
                        return b(D, "TIT1", hbVar);
                    }
                }
            } else if (D == 1735291493) {
                int e10 = e(hbVar);
                String str2 = (e10 <= 0 || e10 > 192) ? null : f4263a[e10 - 1];
                if (str2 != null) {
                    u7Var = new g9("TCON", null, str2);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return u7Var;
            } else if (D == 1684632427) {
                return d(1684632427, "TPOS", hbVar);
            } else {
                if (D == 1953655662) {
                    return d(1953655662, "TRCK", hbVar);
                }
                if (D == 1953329263) {
                    return c(1953329263, "TBPM", hbVar, true, false);
                }
                if (D == 1668311404) {
                    return c(1668311404, "TCMP", hbVar, true, true);
                }
                if (D == 1668249202) {
                    int D3 = hbVar.D();
                    if (hbVar.D() == 1684108385) {
                        int D4 = hbVar.D() & 16777215;
                        if (D4 == 13) {
                            str = MimeTypes.IMAGE_JPEG;
                        } else if (D4 == 14) {
                            str = "image/png";
                            D4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            StringBuilder sb2 = new StringBuilder(41);
                            sb2.append("Unrecognized cover art flags: ");
                            sb2.append(D4);
                            Log.w("MetadataUtil", sb2.toString());
                        } else {
                            hbVar.s(4);
                            int i12 = D3 - 16;
                            byte[] bArr = new byte[i12];
                            hbVar.u(bArr, 0, i12);
                            u7Var = new j8(str, null, 3, bArr);
                        }
                    } else {
                        Log.w("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return u7Var;
                } else if (D == 1631670868) {
                    return b(1631670868, "TPE2", hbVar);
                } else {
                    if (D == 1936682605) {
                        return b(1936682605, "TSOT", hbVar);
                    }
                    if (D == 1936679276) {
                        return b(1936679276, "TSO2", hbVar);
                    }
                    if (D == 1936679282) {
                        return b(1936679282, "TSOA", hbVar);
                    }
                    if (D == 1936679265) {
                        return b(1936679265, "TSOP", hbVar);
                    }
                    if (D == 1936679791) {
                        return b(1936679791, "TSOC", hbVar);
                    }
                    if (D == 1920233063) {
                        return c(1920233063, "ITUNESADVISORY", hbVar, false, false);
                    }
                    if (D == 1885823344) {
                        return c(1885823344, "ITUNESGAPLESS", hbVar, false, true);
                    }
                    if (D == 1936683886) {
                        return b(1936683886, "TVSHOWSORT", hbVar);
                    }
                    if (D == 1953919848) {
                        return b(1953919848, "TVSHOW", hbVar);
                    }
                    if (D == 757935405) {
                        String str3 = null;
                        String str4 = null;
                        int i13 = -1;
                        int i14 = -1;
                        while (hbVar.o() < o10) {
                            int o11 = hbVar.o();
                            int D5 = hbVar.D();
                            int D6 = hbVar.D();
                            hbVar.s(4);
                            if (D6 == 1835360622) {
                                str3 = hbVar.f(D5 - 12);
                            } else if (D6 == 1851878757) {
                                str4 = hbVar.f(D5 - 12);
                            } else {
                                if (D6 == 1684108385) {
                                    i14 = D5;
                                }
                                if (D6 == 1684108385) {
                                    i13 = o11;
                                }
                                hbVar.s(D5 - 12);
                            }
                        }
                        if (str3 != null && str4 != null && i13 != -1) {
                            hbVar.p(i13);
                            hbVar.s(16);
                            u7Var = new a9(str3, str4, hbVar.f(i14 - 16));
                        }
                        return u7Var;
                    }
                }
            }
            String b11 = qy3.b(D);
            Log.d("MetadataUtil", b11.length() != 0 ? "Skipped unknown metadata entry: ".concat(b11) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            hbVar.p(o10);
        }
    }

    public static g9 b(int i10, String str, hb hbVar) {
        int D = hbVar.D();
        if (hbVar.D() == 1684108385) {
            hbVar.s(8);
            return new g9(str, null, hbVar.f(D - 16));
        }
        String b10 = qy3.b(i10);
        Log.w("MetadataUtil", b10.length() != 0 ? "Failed to parse text attribute: ".concat(b10) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static y8 c(int i10, String str, hb hbVar, boolean z10, boolean z11) {
        int e10 = e(hbVar);
        if (z11) {
            e10 = Math.min(1, e10);
        }
        if (e10 >= 0) {
            if (z10) {
                return new g9(str, null, Integer.toString(e10));
            }
            return new r8(C.LANGUAGE_UNDETERMINED, str, Integer.toString(e10));
        }
        String b10 = qy3.b(i10);
        Log.w("MetadataUtil", b10.length() != 0 ? "Failed to parse uint8 attribute: ".concat(b10) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    public static g9 d(int i10, String str, hb hbVar) {
        int D = hbVar.D();
        if (hbVar.D() == 1684108385 && D >= 22) {
            hbVar.s(10);
            int w10 = hbVar.w();
            if (w10 > 0) {
                StringBuilder sb2 = new StringBuilder(11);
                sb2.append(w10);
                String sb3 = sb2.toString();
                int w11 = hbVar.w();
                if (w11 > 0) {
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 12);
                    sb4.append(sb3);
                    sb4.append("/");
                    sb4.append(w11);
                    sb3 = sb4.toString();
                }
                return new g9(str, null, sb3);
            }
        }
        String b10 = qy3.b(i10);
        Log.w("MetadataUtil", b10.length() != 0 ? "Failed to parse index/count attribute: ".concat(b10) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static int e(hb hbVar) {
        hbVar.s(4);
        if (hbVar.D() == 1684108385) {
            hbVar.s(8);
            return hbVar.v();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
