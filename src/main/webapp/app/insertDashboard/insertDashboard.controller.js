/**
 * 
 */

angular.module("Emp")

.controller('InsertController', ['$scope', '$state', 'InsertService',
	function($scope, $state, InsertService) {
	
	
	var vs = this;
	vs.res = "";
	vs.emp = {};
	  vs.addEmp = function(){
		  InsertService.addEmp(vs.emp).then(
					function(response){
						vs.res = response.data.message;
						vs.emp = "";
					},function(error){
						vs.res = error.data.message;
					})
	  }
	  
	  vs.dashboard = function(){
		  $state.go('dashboard');
	  }
	
}])

