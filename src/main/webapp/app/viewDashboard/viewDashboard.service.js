/**
 * 
 */

angular.module("Emp")


.factory('ViewService', ['$http', '$q',
	function($http, $q) { 
	
	var ViewService = {};
	
	ViewService.getEmp = function(){
		var deferred = $q.defer();
		
		$http.get("http://localhost:8090/emp/all").then(
				function(response){
					deferred.resolve(response.data);
				},function(error){
					console.log("some error occured");
					deferred.reject(error);
				})
				return deferred.promise;
	}
	
	
	return ViewService;
	
}])