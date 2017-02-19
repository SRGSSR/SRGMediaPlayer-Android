package ch.srg.mediaplayer;

/**
 * Created by Axel on 27/02/2015.
 */
public interface SRGMediaPlayerMetaDataProvider {
	void getMediaMetadata(String mediaIdentifier, GetMediaMetadataCallback callback);

	SRGMediaMetadata getMediaMetadata(String mediaIdentifier);

	interface GetMediaMetadataCallback {
		void onMediaMetadataLoaded(SRGMediaMetadata srgMediaMetadata);

		void onDataNotAvailable();
	}
}
