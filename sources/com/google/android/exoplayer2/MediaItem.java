package com.google.android.exoplayer2;

import android.net.Uri;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class MediaItem {
    public final ClippingProperties clippingProperties;
    public final LiveConfiguration liveConfiguration;
    public final String mediaId;
    public final MediaMetadata mediaMetadata;
    public final PlaybackProperties playbackProperties;

    /* loaded from: classes3.dex */
    public static final class AdsConfiguration {
        public final Uri adTagUri;
        public final Object adsId;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof AdsConfiguration) {
                AdsConfiguration adsConfiguration = (AdsConfiguration) obj;
                return this.adTagUri.equals(adsConfiguration.adTagUri) && Util.areEqual(this.adsId, adsConfiguration.adsId);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.adTagUri.hashCode() * 31;
            Object obj = this.adsId;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        private AdsConfiguration(Uri uri, Object obj) {
            this.adTagUri = uri;
            this.adsId = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Builder {
        private Uri adTagUri;
        private Object adsId;
        private long clipEndPositionMs;
        private boolean clipRelativeToDefaultPosition;
        private boolean clipRelativeToLiveWindow;
        private long clipStartPositionMs;
        private boolean clipStartsAtKeyFrame;
        private String customCacheKey;
        private boolean drmForceDefaultLicenseUri;
        private byte[] drmKeySetId;
        private Map<String, String> drmLicenseRequestHeaders;
        private Uri drmLicenseUri;
        private boolean drmMultiSession;
        private boolean drmPlayClearContentWithoutKey;
        private List<Integer> drmSessionForClearTypes;
        private UUID drmUuid;
        private long liveMaxOffsetMs;
        private float liveMaxPlaybackSpeed;
        private long liveMinOffsetMs;
        private float liveMinPlaybackSpeed;
        private long liveTargetOffsetMs;
        private String mediaId;
        private MediaMetadata mediaMetadata;
        private String mimeType;
        private List<StreamKey> streamKeys;
        private List<Subtitle> subtitles;
        private Object tag;
        private Uri uri;

        public MediaItem build() {
            PlaybackProperties playbackProperties;
            Assertions.checkState(this.drmLicenseUri == null || this.drmUuid != null);
            Uri uri = this.uri;
            if (uri != null) {
                String str = this.mimeType;
                UUID uuid = this.drmUuid;
                DrmConfiguration drmConfiguration = uuid != null ? new DrmConfiguration(uuid, this.drmLicenseUri, this.drmLicenseRequestHeaders, this.drmMultiSession, this.drmForceDefaultLicenseUri, this.drmPlayClearContentWithoutKey, this.drmSessionForClearTypes, this.drmKeySetId) : null;
                Uri uri2 = this.adTagUri;
                PlaybackProperties playbackProperties2 = new PlaybackProperties(uri, str, drmConfiguration, uri2 != null ? new AdsConfiguration(uri2, this.adsId) : null, this.streamKeys, this.customCacheKey, this.subtitles, this.tag);
                String str2 = this.mediaId;
                if (str2 == null) {
                    str2 = uri.toString();
                }
                this.mediaId = str2;
                playbackProperties = playbackProperties2;
            } else {
                playbackProperties = null;
            }
            String str3 = (String) Assertions.checkNotNull(this.mediaId);
            ClippingProperties clippingProperties = new ClippingProperties(this.clipStartPositionMs, this.clipEndPositionMs, this.clipRelativeToLiveWindow, this.clipRelativeToDefaultPosition, this.clipStartsAtKeyFrame);
            LiveConfiguration liveConfiguration = new LiveConfiguration(this.liveTargetOffsetMs, this.liveMinOffsetMs, this.liveMaxOffsetMs, this.liveMinPlaybackSpeed, this.liveMaxPlaybackSpeed);
            MediaMetadata mediaMetadata = this.mediaMetadata;
            if (mediaMetadata == null) {
                mediaMetadata = new MediaMetadata.Builder().build();
            }
            return new MediaItem(str3, clippingProperties, playbackProperties, liveConfiguration, mediaMetadata);
        }

        public Builder setAdTagUri(String str) {
            return setAdTagUri(str != null ? Uri.parse(str) : null);
        }

        public Builder setClipEndPositionMs(long j10) {
            Assertions.checkArgument(j10 == Long.MIN_VALUE || j10 >= 0);
            this.clipEndPositionMs = j10;
            return this;
        }

        public Builder setClipRelativeToDefaultPosition(boolean z10) {
            this.clipRelativeToDefaultPosition = z10;
            return this;
        }

        public Builder setClipRelativeToLiveWindow(boolean z10) {
            this.clipRelativeToLiveWindow = z10;
            return this;
        }

        public Builder setClipStartPositionMs(long j10) {
            Assertions.checkArgument(j10 >= 0);
            this.clipStartPositionMs = j10;
            return this;
        }

        public Builder setClipStartsAtKeyFrame(boolean z10) {
            this.clipStartsAtKeyFrame = z10;
            return this;
        }

        public Builder setCustomCacheKey(String str) {
            this.customCacheKey = str;
            return this;
        }

        public Builder setDrmForceDefaultLicenseUri(boolean z10) {
            this.drmForceDefaultLicenseUri = z10;
            return this;
        }

        public Builder setDrmKeySetId(byte[] bArr) {
            this.drmKeySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
            return this;
        }

        public Builder setDrmLicenseRequestHeaders(Map<String, String> map) {
            Map<String, String> emptyMap;
            if (map != null && !map.isEmpty()) {
                emptyMap = Collections.unmodifiableMap(new HashMap(map));
            } else {
                emptyMap = Collections.emptyMap();
            }
            this.drmLicenseRequestHeaders = emptyMap;
            return this;
        }

        public Builder setDrmLicenseUri(Uri uri) {
            this.drmLicenseUri = uri;
            return this;
        }

        public Builder setDrmMultiSession(boolean z10) {
            this.drmMultiSession = z10;
            return this;
        }

        public Builder setDrmPlayClearContentWithoutKey(boolean z10) {
            this.drmPlayClearContentWithoutKey = z10;
            return this;
        }

        public Builder setDrmSessionForClearPeriods(boolean z10) {
            setDrmSessionForClearTypes(z10 ? Arrays.asList(2, 1) : Collections.emptyList());
            return this;
        }

        public Builder setDrmSessionForClearTypes(List<Integer> list) {
            List<Integer> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.drmSessionForClearTypes = emptyList;
            return this;
        }

        public Builder setDrmUuid(UUID uuid) {
            this.drmUuid = uuid;
            return this;
        }

        public Builder setLiveMaxOffsetMs(long j10) {
            this.liveMaxOffsetMs = j10;
            return this;
        }

        public Builder setLiveMaxPlaybackSpeed(float f10) {
            this.liveMaxPlaybackSpeed = f10;
            return this;
        }

        public Builder setLiveMinOffsetMs(long j10) {
            this.liveMinOffsetMs = j10;
            return this;
        }

        public Builder setLiveMinPlaybackSpeed(float f10) {
            this.liveMinPlaybackSpeed = f10;
            return this;
        }

        public Builder setLiveTargetOffsetMs(long j10) {
            this.liveTargetOffsetMs = j10;
            return this;
        }

        public Builder setMediaId(String str) {
            this.mediaId = str;
            return this;
        }

        public Builder setMediaMetadata(MediaMetadata mediaMetadata) {
            this.mediaMetadata = mediaMetadata;
            return this;
        }

        public Builder setMimeType(String str) {
            this.mimeType = str;
            return this;
        }

        public Builder setStreamKeys(List<StreamKey> list) {
            List<StreamKey> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.streamKeys = emptyList;
            return this;
        }

        public Builder setSubtitles(List<Subtitle> list) {
            List<Subtitle> emptyList;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            this.subtitles = emptyList;
            return this;
        }

        public Builder setTag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder setUri(String str) {
            return setUri(str == null ? null : Uri.parse(str));
        }

        public Builder() {
            this.clipEndPositionMs = Long.MIN_VALUE;
            this.drmSessionForClearTypes = Collections.emptyList();
            this.drmLicenseRequestHeaders = Collections.emptyMap();
            this.streamKeys = Collections.emptyList();
            this.subtitles = Collections.emptyList();
            this.liveTargetOffsetMs = C.TIME_UNSET;
            this.liveMinOffsetMs = C.TIME_UNSET;
            this.liveMaxOffsetMs = C.TIME_UNSET;
            this.liveMinPlaybackSpeed = -3.4028235E38f;
            this.liveMaxPlaybackSpeed = -3.4028235E38f;
        }

        public Builder setAdTagUri(Uri uri) {
            return setAdTagUri(uri, null);
        }

        public Builder setDrmLicenseUri(String str) {
            this.drmLicenseUri = str == null ? null : Uri.parse(str);
            return this;
        }

        public Builder setUri(Uri uri) {
            this.uri = uri;
            return this;
        }

        public Builder setAdTagUri(Uri uri, Object obj) {
            this.adTagUri = uri;
            this.adsId = obj;
            return this;
        }

        private Builder(MediaItem mediaItem) {
            this();
            ClippingProperties clippingProperties = mediaItem.clippingProperties;
            this.clipEndPositionMs = clippingProperties.endPositionMs;
            this.clipRelativeToLiveWindow = clippingProperties.relativeToLiveWindow;
            this.clipRelativeToDefaultPosition = clippingProperties.relativeToDefaultPosition;
            this.clipStartPositionMs = clippingProperties.startPositionMs;
            this.clipStartsAtKeyFrame = clippingProperties.startsAtKeyFrame;
            this.mediaId = mediaItem.mediaId;
            this.mediaMetadata = mediaItem.mediaMetadata;
            LiveConfiguration liveConfiguration = mediaItem.liveConfiguration;
            this.liveTargetOffsetMs = liveConfiguration.targetOffsetMs;
            this.liveMinOffsetMs = liveConfiguration.minOffsetMs;
            this.liveMaxOffsetMs = liveConfiguration.maxOffsetMs;
            this.liveMinPlaybackSpeed = liveConfiguration.minPlaybackSpeed;
            this.liveMaxPlaybackSpeed = liveConfiguration.maxPlaybackSpeed;
            PlaybackProperties playbackProperties = mediaItem.playbackProperties;
            if (playbackProperties != null) {
                this.customCacheKey = playbackProperties.customCacheKey;
                this.mimeType = playbackProperties.mimeType;
                this.uri = playbackProperties.uri;
                this.streamKeys = playbackProperties.streamKeys;
                this.subtitles = playbackProperties.subtitles;
                this.tag = playbackProperties.tag;
                DrmConfiguration drmConfiguration = playbackProperties.drmConfiguration;
                if (drmConfiguration != null) {
                    this.drmLicenseUri = drmConfiguration.licenseUri;
                    this.drmLicenseRequestHeaders = drmConfiguration.requestHeaders;
                    this.drmMultiSession = drmConfiguration.multiSession;
                    this.drmForceDefaultLicenseUri = drmConfiguration.forceDefaultLicenseUri;
                    this.drmPlayClearContentWithoutKey = drmConfiguration.playClearContentWithoutKey;
                    this.drmSessionForClearTypes = drmConfiguration.sessionForClearTypes;
                    this.drmUuid = drmConfiguration.uuid;
                    this.drmKeySetId = drmConfiguration.getKeySetId();
                }
                AdsConfiguration adsConfiguration = playbackProperties.adsConfiguration;
                if (adsConfiguration != null) {
                    this.adTagUri = adsConfiguration.adTagUri;
                    this.adsId = adsConfiguration.adsId;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class ClippingProperties {
        public final long endPositionMs;
        public final boolean relativeToDefaultPosition;
        public final boolean relativeToLiveWindow;
        public final long startPositionMs;
        public final boolean startsAtKeyFrame;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ClippingProperties) {
                ClippingProperties clippingProperties = (ClippingProperties) obj;
                return this.startPositionMs == clippingProperties.startPositionMs && this.endPositionMs == clippingProperties.endPositionMs && this.relativeToLiveWindow == clippingProperties.relativeToLiveWindow && this.relativeToDefaultPosition == clippingProperties.relativeToDefaultPosition && this.startsAtKeyFrame == clippingProperties.startsAtKeyFrame;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.startPositionMs;
            long j11 = this.endPositionMs;
            return (((((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.relativeToLiveWindow ? 1 : 0)) * 31) + (this.relativeToDefaultPosition ? 1 : 0)) * 31) + (this.startsAtKeyFrame ? 1 : 0);
        }

        private ClippingProperties(long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.startPositionMs = j10;
            this.endPositionMs = j11;
            this.relativeToLiveWindow = z10;
            this.relativeToDefaultPosition = z11;
            this.startsAtKeyFrame = z12;
        }
    }

    /* loaded from: classes3.dex */
    public static final class DrmConfiguration {
        public final boolean forceDefaultLicenseUri;
        private final byte[] keySetId;
        public final Uri licenseUri;
        public final boolean multiSession;
        public final boolean playClearContentWithoutKey;
        public final Map<String, String> requestHeaders;
        public final List<Integer> sessionForClearTypes;
        public final UUID uuid;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DrmConfiguration) {
                DrmConfiguration drmConfiguration = (DrmConfiguration) obj;
                return this.uuid.equals(drmConfiguration.uuid) && Util.areEqual(this.licenseUri, drmConfiguration.licenseUri) && Util.areEqual(this.requestHeaders, drmConfiguration.requestHeaders) && this.multiSession == drmConfiguration.multiSession && this.forceDefaultLicenseUri == drmConfiguration.forceDefaultLicenseUri && this.playClearContentWithoutKey == drmConfiguration.playClearContentWithoutKey && this.sessionForClearTypes.equals(drmConfiguration.sessionForClearTypes) && Arrays.equals(this.keySetId, drmConfiguration.keySetId);
            }
            return false;
        }

        public byte[] getKeySetId() {
            byte[] bArr = this.keySetId;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int hashCode = this.uuid.hashCode() * 31;
            Uri uri = this.licenseUri;
            return ((((((((((((hashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.requestHeaders.hashCode()) * 31) + (this.multiSession ? 1 : 0)) * 31) + (this.forceDefaultLicenseUri ? 1 : 0)) * 31) + (this.playClearContentWithoutKey ? 1 : 0)) * 31) + this.sessionForClearTypes.hashCode()) * 31) + Arrays.hashCode(this.keySetId);
        }

        private DrmConfiguration(UUID uuid, Uri uri, Map<String, String> map, boolean z10, boolean z11, boolean z12, List<Integer> list, byte[] bArr) {
            Assertions.checkArgument((z11 && uri == null) ? false : true);
            this.uuid = uuid;
            this.licenseUri = uri;
            this.requestHeaders = map;
            this.multiSession = z10;
            this.forceDefaultLicenseUri = z11;
            this.playClearContentWithoutKey = z12;
            this.sessionForClearTypes = list;
            this.keySetId = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        }
    }

    /* loaded from: classes3.dex */
    public static final class LiveConfiguration {
        public static final LiveConfiguration UNSET = new LiveConfiguration(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f);
        public final long maxOffsetMs;
        public final float maxPlaybackSpeed;
        public final long minOffsetMs;
        public final float minPlaybackSpeed;
        public final long targetOffsetMs;

        public LiveConfiguration(long j10, long j11, long j12, float f10, float f11) {
            this.targetOffsetMs = j10;
            this.minOffsetMs = j11;
            this.maxOffsetMs = j12;
            this.minPlaybackSpeed = f10;
            this.maxPlaybackSpeed = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof LiveConfiguration) {
                LiveConfiguration liveConfiguration = (LiveConfiguration) obj;
                return this.targetOffsetMs == liveConfiguration.targetOffsetMs && this.minOffsetMs == liveConfiguration.minOffsetMs && this.maxOffsetMs == liveConfiguration.maxOffsetMs && this.minPlaybackSpeed == liveConfiguration.minPlaybackSpeed && this.maxPlaybackSpeed == liveConfiguration.maxPlaybackSpeed;
            }
            return false;
        }

        public int hashCode() {
            long j10 = this.targetOffsetMs;
            long j11 = this.minOffsetMs;
            long j12 = this.maxOffsetMs;
            int i10 = ((((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.minPlaybackSpeed;
            int floatToIntBits = (i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.maxPlaybackSpeed;
            return floatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class PlaybackProperties {
        public final AdsConfiguration adsConfiguration;
        public final String customCacheKey;
        public final DrmConfiguration drmConfiguration;
        public final String mimeType;
        public final List<StreamKey> streamKeys;
        public final List<Subtitle> subtitles;
        public final Object tag;
        public final Uri uri;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PlaybackProperties) {
                PlaybackProperties playbackProperties = (PlaybackProperties) obj;
                return this.uri.equals(playbackProperties.uri) && Util.areEqual(this.mimeType, playbackProperties.mimeType) && Util.areEqual(this.drmConfiguration, playbackProperties.drmConfiguration) && Util.areEqual(this.adsConfiguration, playbackProperties.adsConfiguration) && this.streamKeys.equals(playbackProperties.streamKeys) && Util.areEqual(this.customCacheKey, playbackProperties.customCacheKey) && this.subtitles.equals(playbackProperties.subtitles) && Util.areEqual(this.tag, playbackProperties.tag);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.uri.hashCode() * 31;
            String str = this.mimeType;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            DrmConfiguration drmConfiguration = this.drmConfiguration;
            int hashCode3 = (hashCode2 + (drmConfiguration == null ? 0 : drmConfiguration.hashCode())) * 31;
            AdsConfiguration adsConfiguration = this.adsConfiguration;
            int hashCode4 = (((hashCode3 + (adsConfiguration == null ? 0 : adsConfiguration.hashCode())) * 31) + this.streamKeys.hashCode()) * 31;
            String str2 = this.customCacheKey;
            int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.subtitles.hashCode()) * 31;
            Object obj = this.tag;
            return hashCode5 + (obj != null ? obj.hashCode() : 0);
        }

        private PlaybackProperties(Uri uri, String str, DrmConfiguration drmConfiguration, AdsConfiguration adsConfiguration, List<StreamKey> list, String str2, List<Subtitle> list2, Object obj) {
            this.uri = uri;
            this.mimeType = str;
            this.drmConfiguration = drmConfiguration;
            this.adsConfiguration = adsConfiguration;
            this.streamKeys = list;
            this.customCacheKey = str2;
            this.subtitles = list2;
            this.tag = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Subtitle {
        public final String label;
        public final String language;
        public final String mimeType;
        public final int roleFlags;
        public final int selectionFlags;
        public final Uri uri;

        public Subtitle(Uri uri, String str, String str2) {
            this(uri, str, str2, 0);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Subtitle) {
                Subtitle subtitle = (Subtitle) obj;
                return this.uri.equals(subtitle.uri) && this.mimeType.equals(subtitle.mimeType) && Util.areEqual(this.language, subtitle.language) && this.selectionFlags == subtitle.selectionFlags && this.roleFlags == subtitle.roleFlags && Util.areEqual(this.label, subtitle.label);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.uri.hashCode() * 31) + this.mimeType.hashCode()) * 31;
            String str = this.language;
            int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.selectionFlags) * 31) + this.roleFlags) * 31;
            String str2 = this.label;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public Subtitle(Uri uri, String str, String str2, int i10) {
            this(uri, str, str2, i10, 0, null);
        }

        public Subtitle(Uri uri, String str, String str2, int i10, int i11, String str3) {
            this.uri = uri;
            this.mimeType = str;
            this.language = str2;
            this.selectionFlags = i10;
            this.roleFlags = i11;
            this.label = str3;
        }
    }

    public static MediaItem fromUri(String str) {
        return new Builder().setUri(str).build();
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MediaItem) {
            MediaItem mediaItem = (MediaItem) obj;
            return Util.areEqual(this.mediaId, mediaItem.mediaId) && this.clippingProperties.equals(mediaItem.clippingProperties) && Util.areEqual(this.playbackProperties, mediaItem.playbackProperties) && Util.areEqual(this.liveConfiguration, mediaItem.liveConfiguration) && Util.areEqual(this.mediaMetadata, mediaItem.mediaMetadata);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.mediaId.hashCode() * 31;
        PlaybackProperties playbackProperties = this.playbackProperties;
        return ((((((hashCode + (playbackProperties != null ? playbackProperties.hashCode() : 0)) * 31) + this.liveConfiguration.hashCode()) * 31) + this.clippingProperties.hashCode()) * 31) + this.mediaMetadata.hashCode();
    }

    private MediaItem(String str, ClippingProperties clippingProperties, PlaybackProperties playbackProperties, LiveConfiguration liveConfiguration, MediaMetadata mediaMetadata) {
        this.mediaId = str;
        this.playbackProperties = playbackProperties;
        this.liveConfiguration = liveConfiguration;
        this.mediaMetadata = mediaMetadata;
        this.clippingProperties = clippingProperties;
    }

    public static MediaItem fromUri(Uri uri) {
        return new Builder().setUri(uri).build();
    }
}
