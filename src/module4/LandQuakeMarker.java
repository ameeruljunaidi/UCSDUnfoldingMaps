package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/**
 * Implements a visual marker for land earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Your name here
 *
 */
public class LandQuakeMarker extends EarthquakeMarker {

	public LandQuakeMarker(PointFeature quake) {

		// calling EarthquakeMarker constructor
		super(quake);

		// setting field in earthquake marker
		isOnLand = true;
	}

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Draw a centered circle for land quakes
		// DO NOT set the fill color here. That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered circle.

		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor

		// TODO: Implement this method
		float slope = (float) ((5.0 - 0.0) / (12.0 - 9.0));
		float newRadius = (float) (0.0 + slope * (this.radius - 0.0));
		pg.ellipse(x, y, newRadius, newRadius);
	}

	// Get the country the earthquake is in
	public String getCountry() {
		return (String) getProperty("country");
	}

}