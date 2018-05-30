/**
 * 
 */

angular.module("Emp")


.factory('InsertService', ['$http', '$q',
	function($http, $q) { 
	
	var InsertService = {};
	
	
	InsertService.addEmp = function(emp){
		var deferred = $q.defer();	
		
		$http.post("http://localhost:8090/emp/save",emp).then(
				function(response){
					console.log(response.data.message);
					deferred.resolve(response);
				},function(error){
					console.log("some error occured");
					deferred.reject(error);
				})
				return deferred.promise;
	}
	
	
	
	return InsertService;
	
}])