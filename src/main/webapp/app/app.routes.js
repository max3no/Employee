/**
 * 
 */

angular.module("Emp")


.config(['$stateProvider', '$urlRouterProvider', '$provide', '$httpProvider',

	function($stateProvider, $urlRouterProvider, $provide, $httpProvider){
	
		$stateProvider
			.state('dashboard', {
					url : '/dashboard',
					templateUrl: 'app/dashboard/dashboard.html',
					controller: 'DashboardController',
					controllerAs: 'DCTRL'
			})
			
			.state('add', {
					url : '/add',
					templateUrl: 'app/insertDashboard/insertDashboard.html',
					controller: 'InsertController',
					controllerAs: 'ICTRL'
			})
			
			.state('view', {
					url : '/view',
					templateUrl: 'app/viewDashboard/viewDashboard.html',
					controller: 'ViewController',
					controllerAs: 'VCTRL'
			})
			
			
		$urlRouterProvider.otherwise("/dashboard");
}])