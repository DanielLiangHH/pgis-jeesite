//var map = new ol.Map({
//	view : new ol.View({
//		center : [ 113.84623427412063, 22.969015441771873 ],
//		extent : void 0,
//		maxZoom : 19,
//		minZoom : 10,
//		projection : "EPSG:4326",
//		zoom : 12,
//	}),
//	layers : [
//		new ol.layer.Tile({
//			source : new ol.source.XYZ({
//				url : mapServerUrl + '/Maps/dg_sl/EzMap?Service=getImage&Type=RGB&ZoomOffset=0&Col={x}&Row={y}&Zoom={z}&V=0.3',
//				projection : "EPSG:4326"
//			})
//		})
//	],
//	target : 'map'
//});
new LayerMap('map');
